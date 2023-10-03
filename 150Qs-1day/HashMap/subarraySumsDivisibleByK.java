// 974. Subarray Sums Divisible by K - leetcode
package HashMap;

import java.util.HashMap;

public class subarraySumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans =0;
        int sum =0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            int rem = sum % k;
            if(rem < 0){
                rem = rem + k;
            }

            if(map.containsKey(rem)){
                ans += map.get(rem);
            }
            int temp = map.getOrDefault(rem,0)+1;
            map.put(rem, temp);
        }
        return ans;
    }
}
