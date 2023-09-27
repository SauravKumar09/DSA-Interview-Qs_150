package BitManipulation;

public class singleElementIII {
    public static void main(String[] args){
        final int[] nums = {1,2,1,3,2,5};
        System.out.println(singleNumber(nums));
    }
    
    public static boolean checkBit(int nums, int j){
        if((nums & (1<<j)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int[] singleNumber(int[] nums){
        int v = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            v = v^nums[i];
        }
        int idx =0;
        for(int i=0; i<32; i++){
            if(checkBit(v,i) == true)
            {
                idx = i;
                break;
            }
        }
        int set1 = 0;
        int set2 = 0;

        for(int i=0; i<n; i++){
            if(checkBit(nums[i], idx) == true)
            {
                set1 = set1^nums[i];
            }
            else{
                set2 = set2^nums[i];
            }
        }
        return new int[]{set1, set2};
    }
}
