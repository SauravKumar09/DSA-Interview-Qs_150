// Subarray Sum Equal To K  - leetcode

package HashMap;


import java.util.HashMap;

public class subarraySumEqualToK {
    public int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans =0;
        int sum =0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            int temp = map.getOrDefault(sum,0)+1;
            map.put(sum, temp);
        }
        return ans;
    }
}
