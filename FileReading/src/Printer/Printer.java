package Printer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer {

    public File file;
    public Scanner read;
    public List<String> lines;

    public Printer (String fileName) throws Exception {
       file = new File(fileName);
       read = new Scanner(file);
       lines = new ArrayList<String>();

       while(read.hasNextLine()){
           lines.add(read.nextLine()); // Add all lines to an array list
       }
    }

    // which ever line contains the word in the now newly populated array list is printed.

    public void printLinesWhichContain(String word){
        for(String s : this.lines){
            if(s.contains(word)){
                System.out.println(s);
            }
        }
    }
}
