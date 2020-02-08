package file;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/Azhar/Desktop/testfile.txt");
        Analysis analysis = new Analysis(file);
        /*
        System.out.println(analysis.Lines());
        System.out.println(analysis.Lines());
         */
        System.out.println("Lines: " + analysis.Lines());
        System.out.println("Characters: " + analysis.Characters());
    }
}
