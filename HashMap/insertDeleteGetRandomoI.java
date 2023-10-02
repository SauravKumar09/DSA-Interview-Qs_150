package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class insertDeleteGetRandomoI {
    class RandomizedSet {
    HashMap<Integer, Integer> hm;
    ArrayList<Integer> al;
    Random r;
    public RandomizedSet() {
        hm = new HashMap<>();
        al = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)){
            return false;
        }else{
            hm.put(val,al.size());
            al.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val) == false){
            return false;
        }
        int idx = hm.get(val);
        hm.remove(val);

        if(idx == al.size()-1){
            al.remove(al.size()-1);
            return true;
        }
        int idx1 = idx;
        int idx2 = al.size() - 1;

        int temp = al.get(idx1);
        al.set(idx1, al.get(idx2));
        al.set(idx2, temp);
        al.remove(idx2);
        hm.put(al.get(idx), idx);
        return true;
    }
    
    public int getRandom() {
        return al.get(r.nextInt(al.size()));
    }
}
}
