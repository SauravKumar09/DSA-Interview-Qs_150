package BitManipulation;


public class divideTwoIntegers {
    public static void main(String[] args){
        int dividend = 10;
        int divisor = 3 ;
        System.out.println(divide(dividend, divisor));
    }
    public static int divide(int dividend, int divisor){
        int ans = 0;
        int sign = 1;
        
        if(dividend < 0){
            sign = sign*-1;
            dividend = Math.abs(dividend);
        }
        if(divisor < 0){
            sign = sign*-1;
            divisor = Math.abs(divisor);
        }

        while(dividend > divisor){
            dividend = dividend-divisor;
            ans++;
        }
        return ans*sign;
    }
}
