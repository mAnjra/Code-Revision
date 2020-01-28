import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Azhar/Desktop/testdelete/test.txt"); // You have to give the full pathname
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
        file.delete();
    }
}
