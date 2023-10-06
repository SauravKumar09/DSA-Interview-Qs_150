package Heap;

import java.util.PriorityQueue;

public class minimumCostToConnectSticks {
    public int connectSticks(int[] sticks)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val: sticks)
        {
            pq.add(val);
        }
        int ans = 0;
        while(pq.size() > 1)
        {
            int rem1 = pq.remove();
            int rem2 = pq.remove();

            ans += rem1 + rem2;
            pq.add(rem1 + rem2);
        }
        return ans;
    }
}
