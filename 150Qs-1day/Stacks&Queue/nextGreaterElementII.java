import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementII{
    public int[] nextGreaterElement(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);

        for(int i=0; i<nums.length*2; i++){
            while(st.size()>0 && nums[st.peek()]<nums[i % nums.length])
            {
                ans[st.pop()] = nums[i % nums.length];
            }
            if(i < nums.length){
                st.push(i);
            }
        }
        return ans;
    }
}