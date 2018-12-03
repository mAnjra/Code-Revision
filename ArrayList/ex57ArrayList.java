import java.util.ArrayList;
import java.util.Scanner;

public class ex57ArrayList{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true){
            System.out.print("Please type a word: ");
            String add = scan.nextLine();
            if(add.isEmpty()){//or you could write add.equals("")
                scan.close();
                break;
            }else{
                words.add(add);
            }      
        }

System.out.println("Here are the words: ");
        for(String w : words){
            System.out.println(w);
        }
    }
}
