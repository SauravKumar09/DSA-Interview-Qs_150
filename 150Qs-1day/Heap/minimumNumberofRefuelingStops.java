package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class minimumNumberofRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations)
    {
       int current = startFuel;
       int ans = 0;
       int i =0;
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       while(current < target){
           while(i < stations.length && stations[i][0] <= current)
           {
              pq.add(stations[i][1]);
              i++;
            }
            if(pq.size() == 0)
            {
                return -1;
            }
            int nextfuel = pq.remove();
            current += nextfuel;
            ans++;
        }
        return ans;
    }
}
