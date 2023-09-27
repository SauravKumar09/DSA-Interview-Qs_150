package Arrays;

import java.util.Arrays;

public class nextGreaterElementIII {
    public static void main(String[] args){
        int n = 12;
        System.out.println(greater(n));
    }
    public static int greater(int n){
        char[] number = (n+"").toCharArray();

        int i;
        for(i = number.length - 1; i>0; i--){
            if(number[i-1] < number[i]){
                break;
            }
        }
        if(i == 0){
            return -1;
        }
        int x = number[i-1];
        int smallest = i;

        for(int j = i+1; j<number.length; j++){
            if(number[j] > x && number[j] <= number[smallest]){
                smallest = j;
            }
        }
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = temp;

        Arrays.sort(number,i,number.length);  // Due sorting it takes more time to run
        // instead of sorting we can reverse the array
        long ans = Long.parseLong(new String(number));

        if(ans > Integer.MAX_VALUE){
            return -1;
        }else{
            return (int)ans;
        }
    }
}
