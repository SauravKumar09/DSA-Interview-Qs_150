import java.util.Stack;

public class basicCalculator {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int sign = 1;
        int ans = 0;
        
        while(i<s.length()){
            char ch = s.charAt(i);

            if(ch>= '0' && ch <= '9'){
                int val = 0;
                while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')
                {
                    val = val*10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;

                val = val * sign;
                sign = 1;
                ans += val;
            }
            else if(ch == '('){
                st.push(ans);
                st.push(sign);
                sign = 1;
                ans = 0;
            }
            else if(ch == ')'){
                ans *= st.pop();
                ans += st.pop();
            }
            else if(ch == '-'){
                sign = sign * -1;
            }
            i++;
        }
        return ans;
    }
}
