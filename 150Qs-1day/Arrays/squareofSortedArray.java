package Arrays;

import java.util.Arrays;

public class squareofSortedArray {
    // T. C. - Nlogn
    public static void sorted(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args)
    {
        int nums[] = { -4, -1, 0, 3, 15 };
        int n = nums.length;
        sorted(nums);
        System.out.println("");
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
    }
}
  
// Optimize Appoarch

// T.C. - log(n)

// public int[] sortedSquares(int[] nums){
//         int[] ans = new int[nums.length];
//         int i = 0;
//         int j = nums.length - 1;

//         for(int k= nums.length-1; k>=0; k--){
//             int comp1 = nums[i]*nums[i];
//             int comp2 = nums[j]*nums[j];

//             if(comp1 > comp2){
//                 ans[k] = comp1;
//                 i++;
//             }else{
//                 ans[k] = comp2;
//                 j--;
//             }
//         }
//         return ans;
//     }