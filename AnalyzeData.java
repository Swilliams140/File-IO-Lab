package Pratice;
import java.util.*; //wildcard
import java.io.*;
public class AnalyzeData {
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();

        String inputFile = "src/Practice/input.txt";

        try {
            Scanner input = new Scanner(inputFile);
            while (input.hasNext()) {
                if (input.hasNextInt()) {
                    int a = input.nextInt();
                    dataList.add(a);
                } else {
                    input.next();
                }
            }
            input.close();

        } catch (Exception e) {
            System.out.println("file not found");
        }

        try (PrintWriter pw = new PrintWriter("output.txt")) {
            for (int value : dataList) {
                pw.println(value);
            }
        }catch(IOException ex){
                System.out.println("File cant be written");

        }
        try(PrintWriter pw2 = new PrintWriter("result.txt")){
            pw2.println();
        }catch(IOException e){
            System.out.println("file not found");
        }
    }
}