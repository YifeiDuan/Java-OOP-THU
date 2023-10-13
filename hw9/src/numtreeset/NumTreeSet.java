package numtreeset;

import java.util.TreeSet;

public class NumTreeSet {
    TreeSet<Integer> data = new TreeSet<Integer>();

    NumTreeSet(int[] a){
        for(int i = 0; i < a.length; i ++){
            data.add(a[i]);
        }
    }

    public int work(){
        return data.size();
    }
}
