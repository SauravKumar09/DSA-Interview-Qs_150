package HashMap;

import java.util.HashMap;

public class equalZeroOneandTwo {
    public long getSubstringWithEqual012(String str)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0#0" , 1);
        int zerocount = 0;
        int onecount = 0;
        int twocount = 0;
        int ans = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                zerocount++;
            }
            if(str.charAt(i) == '1'){
                onecount++;
            }
            if(str.charAt(i) == '2'){
                twocount++;
            }
            int diff1 = zerocount-onecount;
            int diff2 = onecount-twocount;

            String st = diff1 + "#" + diff2;
            int freq = map.getOrDefault(st, 0);
            ans = ans + freq;
            freq++;
            map.put(st, freq);
        }
        return ans;
    }
}
