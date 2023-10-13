package numarraylist;

import java.util.ArrayList;

public class NumArrayList {
    ArrayList<Integer> data = new ArrayList<Integer>();

    NumArrayList(int[] a){
        for(int i = 0; i < a.length; i ++){
            data.add(a[i]);
        }
    }

    public ArrayList<Integer> work(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < data.size(); i ++){
            if(data.get(i) >= 5000){
                temp.add(data.get(i));
            }
        }
        return temp;
    }
}
