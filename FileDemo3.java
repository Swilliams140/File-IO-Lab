import java.io.IOException;
import java.io.*; //wildcard
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args){
        String input = "src/input.txt";
        String output = "Src/output.txt";

        try{
            Scanner scanner = new Scanner(new File(input));
            PrintWriter pw = new PrintWriter(output);

            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                Scanner subScanner = new Scanner(data);
                while(subScanner.hasNext()){
                    if (subScanner.hasNextInt()){
                        int newValue = subScanner.nextInt();
                        pw.println(newValue);
                    }
                    else{
                        subScanner.next();
                    }
                }
            }
            pw.close();
        }catch(IOException e){

        }
    }
}
