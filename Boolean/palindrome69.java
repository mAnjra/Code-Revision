import java.util.ArrayList;
import java.util.Scanner;

public class palindrome69{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type a word: ");
        String word = scan.nextLine();
        scan.close();
        if(palindrome(word)){
            System.out.print("palindoromination");
        }else{
            System.out.print("palindrominated");
        }
    }
    public static boolean palindrome(String pword){
        String rev = "";//have to create this, cannot add to an uninitialised variable
        for(int i = pword.length()-1; i >=0;i--){
            rev = rev + pword.charAt(i);//also have to add char and empty string together before assigning them to 'rev' string otherwise rev string will keep getting replaced
            //rev = rev + Character.toString(pword.charAt(i)); another way to do it by wrapping char
        }
        if(rev.equals(pword)){
            return true;
        }
        return false;
    }
    /**
     * There are a few ways to convert char to string.
     * Method 1: using toString()
     * 
     * char c = "a";
     * String str = Character.toString(c); //the character class wraps a primitive type char into an object, it also has a few helpful methods- https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
     * ..print it
     * 
     * Method 2: using valueOf() method
     * char c = "s";
     * String str = String.valueOf(c); 
     * 
     * String to char:
     * String str = "chad"
     * for(i =0;i<=str.length()-1;i++){
     * char c = str.charAt(i);
     * ...or char c = str + str.charAt(i);
     * ...print it here or out of loop
     * }
     */
}