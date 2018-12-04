import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse59{

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
       while(true){
        String word = scan.nextLine();
           if(word.isEmpty()){
               scan.close();
               break;
           }else{ 
                list.add(word);    
               }           
       }
       Collections.reverse(list);
       for(String i : list){
           System.out.println(i);
       }
    }
}