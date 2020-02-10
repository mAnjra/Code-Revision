package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    public Scanner read;
    public List<String> lines;

    public WordInspection(File file ) throws Exception{
        this.read = new Scanner(file, "UTF-8");
        this.lines = new ArrayList<String>();

        while (read.hasNextLine()){
            this.lines.add(read.nextLine());
        }
    }

    public int wordCount(){
        //return this.lines.size(); // will need to change constructor while loop add method to read.next() instead

        // using strings split method and regex - something new
        int chars = 0;
        for(String s : this.lines){
            chars += s.split("\\s").length; // split returns an array here we just want the length
                                                    // the regular expression we use counts the whitespace.
        }
        return chars;
    }
}
