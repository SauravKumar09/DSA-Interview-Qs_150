package BitManipulation;

public class singleElementII {
        
        public static void main(String[] args){
            final int[] nums = {2,2,3,2};
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
        public static int singleNumber(int[] nums) {
            int ans = 0;
    
            for(int i=0; i<32; i++){
                int count = 0;
    
                for(int j =0; j<nums.length; j++){
                    if(checkBit(nums[j],i) == true){
                        count++;
                    }
                }
                if(count % 3 == 1){
                    ans = ans + (1<<i);
                }
            }
            return ans;
    
        }
}
