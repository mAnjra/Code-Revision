package file;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {

    public Scanner read;
    public List<String> line;


    public  Analysis(File file) throws Exception {
        this.read = new Scanner(file);
        this.line = new ArrayList<String>();

        // add lines to arraylist
        while(this.read.hasNextLine()){
            line.add(this.read.nextLine());
        }
    }

    public int Lines() {
        return this.line.size();
        /*
        int counter = 0;
        for (String s : this.line) {
            ++counter;
        }
        return counter;
        */
    }

    public int Characters(){
        int chars = 0;
       for(String c : this.line){
          //simple way
           chars += c.replace(" ","").length(); // easiest way to get rid off whitespace
          //longer
           /*
           for(int i = 0; i < c.length(); i++){
               if(c.charAt(i) != ' '){
                   chars++;
               }
           }*/
       }
       return chars;
    }
}
