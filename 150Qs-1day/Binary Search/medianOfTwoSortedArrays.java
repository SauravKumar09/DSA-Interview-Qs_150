/* 
 4. Median of Two Sorted Arrays :- leetcode
 
 * Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

* Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Note: - Google, Microsoft, Amazon, Flipkart....
 */

public class medianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
          return findMedianSortedArrays(nums2, nums1);
        }
        int low=0, high=n1;
        int left=(n1+n2+1)/2;
        int n=n1+n2;
        while(low<=high){
          int mid1=(low+high)/2;
          int mid2=left-mid1;
          int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
          int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
          if(mid1<n1){
            r1=nums1[mid1];
          }
          if(mid2<n2){
            r2=nums2[mid2];
          }
          if(mid1-1>=0){
            l1=nums1[mid1-1];
          }
          if(mid2-1>=0){
            l2=nums2[mid2-1];
          }
          if(l1<=r2 && l2<=r1){
            if(n%2==1){
              return Math.max(l1, l2);
            }
            return ((double)(Math.max(l1, l2)+Math.min(r1, r2)))/2.0;
          }
          else if(l1>l2){
            high=mid1-1;
          }
          else{
            low=mid1+1;
          }
        } 
        return 0;
    }
}
