// Subarrays with equal 1s and 0s - GFG
/*Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6) 
*/


package HashMap;

import java.util.HashMap;

public class subarraysWithEqual1sAnd0s {
    public static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int zerocount = 0;
        int onecount = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zerocount++;
            }else if(arr[i] == 1){
                onecount++;
            }
            int diff = zerocount-onecount;
            int freq = map.getOrDefault(diff, 0);
            ans+=freq;
            freq++;
            map.put(diff, freq);
        }
        return ans;
    }
}
