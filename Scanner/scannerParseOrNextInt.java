import java.util.Scanner;

public class scannerParseOrNextInt{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
        int length = scan.nextInt();// this did not work becouse it did not start a new line, so anything that comes after it wont be processed
        //why wont it be processed, becouse nextInt leaves behind a charachter space and that gets processed instead so an empty space is stored in word
    
        String word = scan.nextLine(); //this scan does not get processed as next int leaves behind a charachter space which gets assigned to it 
        String g = scan.nextLine();//this one does becuase we've used next line, but next line does not work with int, so we have to parse it

        //below we use parse and nextLine so it starts on a new line

        //int length = scan.nextLine();//this gives me an error as string cannot be converted into an int in this instance
        //int length = Integer.parseInt(scan.nextLine());
        scan.close();
        
        System.out.println(word+length+g);
        System.out.println(word);

    }
}