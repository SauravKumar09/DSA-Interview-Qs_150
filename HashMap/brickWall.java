package HashMap;

import java.util.HashMap;
import java.util.List;

public class brickWall {
    
    public static int leastBricks(List<List<Integer>> wall){
        int n = wall.size();
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(List<Integer> temp: wall){
            int prefix = 0;
            for(int i=0; i<temp.size()-1; i++){
                int val = temp.get(i);
                prefix += val;
                map.put(prefix, map.getOrDefault(prefix,0)+1);
                ans = Math.max(ans, map.get(prefix));
            }
        }
        return n - ans;
    }
}
