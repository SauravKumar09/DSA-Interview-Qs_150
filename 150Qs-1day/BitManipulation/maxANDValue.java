package BitManipulation;

public class maxANDValue {
    public static boolean checkBit(int nums, int i){
        if((nums & (1<<i)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
    
   // Function for finding maximum AND value.
    public static int maxAND (int arr[], int N) {
        
        // Your code here
        // You can add extra function (if required)
        int ans =0;
        for(int i=31; i>=0; i--){
            int c =0;
            
            for(int j=0; j<N; j++){
                if(checkBit(arr[j],i) == true){
                    c++;
                }
            }
            if(c >= 2){
                ans = ans + (1<<i);
                for(int j=0; j<N; j++){
                   if(checkBit(arr[j],i) == false){
                      arr[j] = 0;
                    }
                }
            }
        }
        return ans;
        
    }
}
