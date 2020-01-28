import java.io.File;
import java.util.Scanner;

public class PrintEveryFiveWords {
    public static void main(String[] args) throws Exception { // exception handling delegated to main method
        File file = new File("/Users/Azhar/Desktop/tests.txt");
        Scanner read = new Scanner(file);

        int whichNumber = 0;
        while(read.hasNext()){
            whichNumber++;
            String word = read.next(); // nextline would require you to put the new word on a new line

            if(whichNumber % 5 == 0){
                System.out.println(word);
            }
        }
    }
}
