package datachooser;

import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class DataChooser{
    ArrayList<String> department = new ArrayList<>();
    DataChooser(String input, String output){
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(input));

            while((line = br.readLine()) != null){
                String[] rl = line.split(",");
                department.add(rl[3]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        BufferedWriter bw = null;
        try{
            File csv = new File(output);
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csv)));

            if((department != null)&&(!department.isEmpty())){
                for(String data : department){
                    bw.append(data);
                    bw.append("\r\n");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                bw.close();
                bw = null;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
