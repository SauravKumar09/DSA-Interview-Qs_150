
// GFG {Check Arithmetic Progressions}

package HashMap;

import java.util.HashMap;

public class checkAPSequence {
    public static void main(String[] args){
         int[] arr = {0,12,4,8};
         int n = 4;
         System.out.println(checkIsAP(arr, n));
    }
    public static boolean checkIsAP(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < min){
                secmin = min;
                min = arr[i];
            }else if(arr[i] < secmin){
                secmin = arr[i];
            }
            if(map.containsKey(arr[i]) == false){
                map.put(arr[i], 1);
            }
        }
        int d = secmin - min;
        if(d == 0){
            if(map.size() == 1){
                return true;
            }else{
                return false;
            }
        }
        int temp = secmin;
        for(int i=0; i<n-1; i++){
            if(map.containsKey(temp) == false){
                return false;
            }
            temp = temp + d;
        }
        return true;
    }
}
