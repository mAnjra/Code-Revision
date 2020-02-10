package wordinspection;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/Azhar/Desktop/testfile.txt");
        WordInspection wordInspection = new WordInspection(file);
        System.out.println(wordInspection.wordCount());
    }
}
