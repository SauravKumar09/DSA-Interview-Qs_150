// 128. Longest Consecutive Sequence - leetCode

/*  Example 1:
Input: nums = [100,4,200,1,3,2]
  Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.*/

package HashMap;

import java.util.HashMap;

public class longestConsectiveSequence {
    public int longestConsective(int[] nums)
    {
        int n1 = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<n1; i++){
            int n = nums[i];
            if(map.containsKey(n) == false){
                int sp = n;
                int ep = n;
                if(map.containsKey(n-1) == true)
                {
                    sp = sp - map.get(n-1);
                }
                if(map.containsKey(n+1) == true){
                    ep = ep + map.get(n+1);
                }
                int len = ep - sp + 1;
                map.put(sp, len);
                map.put(ep, len);

                if(sp != n && ep != n){
                    map.put(n, 1);
                }
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}
