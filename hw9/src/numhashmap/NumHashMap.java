package numhashmap;

import java.util.HashMap;
import java.util.Locale;

public class NumHashMap {
    HashMap<String,String> map = new HashMap<String,String>();
    NumHashMap(){
        map.put("v","a");
        map.put("e","b");
        map.put("k","c");
        map.put("n","d");
        map.put("o","e");
        map.put("h","f");
        map.put("z","g");
        map.put("f","h");
        map.put("a","i");
        map.put("l","j");
        map.put("j","k");
        map.put("x","l");
        map.put("d","m");
        map.put("m","n");
        map.put("y","o");
        map.put("g","p");
        map.put("b","q");
        map.put("r","r");
        map.put("c","s");
        map.put("s","t");
        map.put("w","u");
        map.put("q","v");
        map.put("u","w");
        map.put("p","x");
        map.put("t","y");
        map.put("i","z");
        map.put(" "," ");
        map.put(",",",");
        map.put(".",".");
        map.put("!","!");
        map.put(":",":");
        map.put(";",";");
        map.put("V","A");
        map.put("E","B");
        map.put("K","C");
        map.put("N","D");
        map.put("O","E");
        map.put("H","F");
        map.put("Z","G");
        map.put("F","H");
        map.put("A","I");
        map.put("L","J");
        map.put("J","K");
        map.put("X","L");
        map.put("D","M");
        map.put("M","N");
        map.put("Y","O");
        map.put("G","P");
        map.put("B","Q");
        map.put("R","R");
        map.put("C","S");
        map.put("S","T");
        map.put("W","U");
        map.put("Q","V");
        map.put("U","W");
        map.put("P","X");
        map.put("T","Y");
        map.put("I","Z");
    }

    public String decrypt(String str){
        String result = "";
        for(int i = 0; i < str.length(); i ++){
            String sub = str.substring(i,i+1);
            result = result + map.get(sub);
        }
        return result;
    }
}
