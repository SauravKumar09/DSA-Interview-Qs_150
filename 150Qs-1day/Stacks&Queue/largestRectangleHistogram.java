

import java.util.Stack;


public class largestRectangleHistogram {
    public int largestRectangleArea(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int omax = 0;

        for(int i=0; i<=arr.length; i++){
            int temp;
            if(i==arr.length){
                temp = 0;
            }else{
                temp = arr[i];
            }
            while(s.size()>0 && temp<arr[s.peek()]){
                int tbs = s.pop();
                int nsr = i;
                int nsl;
                if(s.size() == 0){
                    nsl = -1;
                }else{
                    nsl = s.peek();
                }
                int width = nsr-nsl-1;
                omax = Math.max(omax, width*arr[tbs]);
            }
            s.push(i);
        }
        return omax;
    }
}
