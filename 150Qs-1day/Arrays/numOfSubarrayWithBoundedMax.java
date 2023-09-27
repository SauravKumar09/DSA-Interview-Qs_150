package Arrays;

public class numOfSubarrayWithBoundedMax {
    
    public static void main(String[] args){
       int[] nums = {2,9,2,5,6};
       int left = 0;
       int right = 0;
       System.out.println(subarray(nums, left, right));
    }
    public static int subarray(int[] nums, int left, int right){
        int n = nums.length;
        int j = 0;
        int ans = 0;

        int prevcount = 0;

        for(int i=0; i<n; i++){
            if(nums[i]>=left && nums[i]<=right){
                ans += (i-j+1);
                prevcount = (i-j+1);
            }else if(nums[i] < left){
                ans+=prevcount;
            }else{
                j = i+1;
                prevcount = 0;
            }
        }
        return ans;
    }
}
