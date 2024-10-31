import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleNameCreator {
    public static void main(String[] args){
        String inputFile = "";
        String outputFile = "src/outputFile.txt";

        try {
            File iFile = new File(inputFile);
            Scanner myScanner = new Scanner(iFile);
            PrintWriter pw = new PrintWriter(outputFile);
            while(myScanner.hasNextLine()){
                String line = myScanner.nextLine();
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println("File not found");
        }

    }
}
