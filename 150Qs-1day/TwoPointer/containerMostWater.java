package TwoPointer;

public class containerMostWater {
    public static void main(String[] args){
       int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
       System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int i=0;
        int j = height.length-1;
        int max = 0;

        while(i < j){
            int h = Math.min(height[i], height[j]);
            int w = j-i;

            int area = h*w;
            max = Math.max(max, area);

            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}


// Output = 49