package TwoPointer;

 //GFG

import java.util.Arrays;

public class keyPair {
    public static void main(String[] args){
       int arr[] = {1, 2, 4, 3, 6};
       int n = arr.length;
       int k = 10;
       System.out.println(hasArrayTwoCandiadtes(arr, n, k));
    }
    public static boolean hasArrayTwoCandiadtes(int arr[], int n, int k){
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        
        while(i < j){
            if(arr[i]+arr[j] == k){
                return true;
            }
            else if(arr[i]+arr[j] < k){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
 
    

