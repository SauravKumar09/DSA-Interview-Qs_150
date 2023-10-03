// 438. Find All Anagrams in a String

/* Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:The substring with start index = 0 is "cba", which is an anagram of "abc".
            The substring with start index = 6 is "bac", which is an anagram of "abc".  
*/

package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        HashMap<Character, Integer> hmp = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> hms = new HashMap<>();
        int matchcount = 0;
        for(int i=0; i<p.length(); i++){
            char ch = s.charAt(i);
            hms.put(ch, hms.getOrDefault(ch, 0)+1);

            if(hms.get(ch) <= hmp.getOrDefault(ch, 0)){
                matchcount++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(matchcount == p.length()){
            ans.add(0);
        }
        int sp = 0;
        int ep = p.length();
        while(ep < s.length()){
            char chs = s.charAt(sp);
            char che = s.charAt(ep);

            hms.put(che, hms.getOrDefault(che, 0)+1);
            if(hms.get(che) <= hmp.getOrDefault(che, 0)){
                matchcount++;
            }
            hms.put(chs, hms.get(chs) -1);
            if(hms.get(chs) < hmp.getOrDefault(chs, 0)){
                matchcount--;
            }
            sp++;
            ep++;
            if(matchcount == p.length()){
                ans.add(sp);
            }
        }
        return ans;
    }
}
