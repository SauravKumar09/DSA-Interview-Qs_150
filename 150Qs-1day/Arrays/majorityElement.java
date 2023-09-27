package Arrays;

public class majorityElement {
    public static void main(String[] args){
        int[] nums = {5, 7, 4, 7, 4, 3, 4, 4, 4, 7, 4, 4, 7, 4, 4};
        System.out.println(element(nums));
    }
    // Moore's Voting Algorithms
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static int element(int[] nums) {
        int count = 1;
        int val = nums[0];

        for(int i=1; i<nums.length; i++){
            if(count == 0){
                val = nums[i];
                count = 1;
            }else if(nums[i] == val){
                count++;
            }

            else{
                count--;
            }
        }
        return val;
    }
}
