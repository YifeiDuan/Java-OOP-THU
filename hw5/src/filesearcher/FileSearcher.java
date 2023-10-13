package filesearcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class FileSearcher {
    public BufferedReader br = null;
    public int count = 0;
    public File file = null;
    FileSearcher(String filename){
        try{
            br = new BufferedReader(new FileReader(filename));
            file = new File(filename);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public int search(String w){
        count = 0;
        String line = "";

        try{
            br.mark((int)file.length() + 1);

            while((line = br.readLine()) != null){
                line = line.replaceAll("'", " ");
                line = line.replaceAll("-", " ");
                line = line.replaceAll(",", "");
                line = line.replaceAll("\\.", "");
                line = line.replaceAll("\\?", "");
                line = line.replaceAll("!", "");
                String thisLine[] = line.split(" ");

                for(int i = 0; i < thisLine.length; i ++){
                    String str = thisLine[i].toLowerCase();
                    if(str.equals(w)){
                        count ++;
                    }
                    else continue;
                }
            }

            br.reset();

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(count);
        return count;
    }
}
