package Arrays;

import java.util.Arrays;

public class meetingRoomII {
    
    public static void main(String[] args){
       int[][] intervals = {{0,30},{5,20},{15,20}};
       System.out.println(minMeetingRooms(intervals));
    }
    public static int minMeetingRooms(int[][] intervals){
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0; i<n; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i=0;
        int j=0;
        int croom = 0;
        int oroom = Integer.MIN_VALUE;

        while(i < n){
            if(start[i] < end[j]){
                croom++;
                i++;
            }else{
                croom--;
                j++;
            }
            oroom = Math.max(oroom, croom);
        }
        return oroom;
    }
}
