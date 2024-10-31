package Pratice;
import java.io.*;
import java.util.*;

public class AnalyzeData2 {
    public static void main(String[] args){
        //create an ArrayList
        ArrayList<Integer> dataList = new ArrayList<Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while((line = br.readLine()) != null){
                for(String x : line.split("\\s+")){
                    int value = Integer.parseInt(x);
                    dataList.add(value);
                }
            }

        }catch(IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
