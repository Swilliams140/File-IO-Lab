import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args){

        String input = "src/book1";
        String output = "src/output.txt";

        try {

            File f = new File(input);
            Scanner scanner = new Scanner(f);
            PrintWriter pw = new PrintWriter(output);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] element = data.split(",");
                    for(String x: element){
                        int trimmedIntegerValue = Integer.parseInt(x.trim());
                        int computedValue = trimmedIntegerValue * 10;

                        pw.printf("%5d", computedValue);
                    }
            }

            pw.close();

        }catch(IOException e){

        }
    }
}
