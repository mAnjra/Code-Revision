package Dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private Scanner scan = new Scanner(System.in);
    private Dictionary dictionary = new Dictionary();


    public TextUserInterface(Scanner scan, Dictionary dictionary){
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statement:");
        System.out.println("quit - quit the text user interface");
        while(true){
            System.out.print("Statement: ");
            String option = scan.nextLine();
            if(option.toLowerCase().equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if (option.toLowerCase().equals("add")){
                add();
            }else  if (option.toLowerCase().equals("translate")){
                translate();
            }else {
                System.out.println("Unknown Statement");
            }
        }
    }

    public void add(){
        System.out.print("In Finnish: ");
        String addWord = scan.nextLine();
        System.out.print("Translation: ");
        String translation = scan.nextLine();
        this.dictionary.add(addWord, translation);
    }

    public void translate(){
        System.out.print("Give a word: ");
        String word = scan.nextLine();
        System.out.println("Translation: "+ this.dictionary.translate(word));
    }


}
