/*
  81. Search in Rotated Sorted Array II :- leetcode
 
Example 1:
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:
Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false

 */

public class searchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target)
    {
        int lo = 0;
        int hi = nums.length-1;

        while(lo <= hi)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target)
            {
                return true;
            }
            if((nums[mid] == nums[lo]) && nums[mid] == nums[hi]){
                lo++;
                hi--;
            }
            else if(nums[lo] <= nums[mid])
            {
                if(target >= nums[lo] && target <= nums[mid])
                {
                    hi = mid-1;
                }
                else
                {
                    lo = mid+1;
                }
            }
            else
            {
                if(target >= nums[mid] && target <= nums[hi])
                {
                    lo = mid + 1;
                }
                else
                {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}
