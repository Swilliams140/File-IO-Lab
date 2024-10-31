import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo1 {
    public static void main(String[] args){

        String input = "src/book1";
        String output = "src/output.txt";

        try {

            File f = new File(input);
            Scanner scanner = new Scanner(f);
            PrintWriter pw = new PrintWriter(output);

            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String cleanedData = data.replaceAll("[^0-9]","");
                System.out.println(cleanedData);
            }

        }catch(IOException e){

        }
    }
}
