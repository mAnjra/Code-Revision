package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private Scanner read;
    private List<String> lines;
    private List<String> tempList = new ArrayList<String>();

    public WordInspection(File file) throws Exception {
        this.read = new Scanner(file, "UTF-8");
        this.lines = new ArrayList<String>();

        while (read.hasNextLine()) {
            this.lines.add(read.next());
        }
    }

    public int wordCount() {
        //return this.lines.size(); // will need to change constructor while loop add method to read.next() instead
        // using strings split method and regex
        int chars = 0;
        for (String s : this.lines) {
            chars += s.split("\\s").length; // split returns an array here we just want the length
            // the regular expression we uses the whitespace as the
            // delimiter
        }
        return chars;
    }

    public List<String> wordContainingZ() {
        tempList.clear();
        for (String s : this.lines) {
            if (s.contains("z")) {
                tempList.add(s);
            }
        }
        return tempList;
    }

    public List<String> wordsEndingInL() {
        tempList.clear();
        for (String s : this.lines) {
            s.toLowerCase();
            if (s.endsWith("l")) {
                tempList.add(s);
            }
        }
        return tempList;
    }

    public List<String> palindromes(){
        tempList.clear();

        String rev1 = "";
        for(String s : this.lines){
            rev1 = new StringBuilder(s).reverse().toString();
            if(rev1.equals(s)){
                this.tempList.add(s);
            }
        }
        /*
        String rev = "";
        for(String s : this.lines){
            rev = "";
            if(s.charAt(0)==s.charAt(s.length()-1)){
                for(int i = s.length()-1; i >= 0; i--){
                    rev += s.charAt(i);
                }
            }
            if(s.equals(rev)){
                tempList.add(s);
            }
        }*/
        return this.tempList;
    }

    public List<String> wordWhichContainAllVowels(){
        tempList.clear();
        String store = "";
        for(String c : this.lines){
            if(c.contains("a")&&c.contains("e")&&c.contains("i")&&c.contains("o")&&c.contains("u")){
                tempList.add(c);
            }
        }
        return tempList;
    }

}
