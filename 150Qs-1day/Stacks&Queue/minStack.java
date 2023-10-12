

import java.util.Stack;

public class minStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    
    public void push(int val){
        if(st.size() == 0){
            st.push(val);
            min.push(val);
            return;
        }
        st.push(val);
        int temp = Math.min(val, min.peek());
        min.push(temp);
    }
    public void pop(){
        st.pop();
        min.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return min.peek();
    }
}
