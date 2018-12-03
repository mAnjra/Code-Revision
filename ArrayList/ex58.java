import java.util.ArrayList;
import java.util.Scanner;

public class ex58{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.print("Please enter a word: ");
            String add = scan.nextLine();
            if(list.contains(add)){
                scan.close();
                break;
            }else{
                list.add(add);
            }
        }

        for(String s: list){
            System.out.println(s);
        }
    }
}