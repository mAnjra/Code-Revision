# Java basics - constant code revision - exercises

String Methods:

    import java.util.Scanner;

    public class StringMethods{

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){      
        //firstPart();
        //lastPart();
        //inside();
        reverse();
    }


    public static void firstPart(){

        //Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scan.nextLine();
        System.out.print("Please enter length of the first part: ");
        int length = Integer.parseInt(scan.nextLine());
        scan.close();

        word = word.substring(0, length);
        System.out.println("Result: "+word);
    }

    public static void lastPart(){
        //Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scan.nextLine();
        System.out.print("Please enter length of the end part: ");
        int length = Integer.parseInt(scan.nextLine());
        scan.close();

        word = word.substring(word.length()-length);
        System.out.println("Result: " +word);
    }

    public static void inside(){
        System.out.print("Enter your word: ");
        String word = scan.nextLine();
        System.out.print("Enter your search word: ");
        String search = scan.nextLine();

        int index = word.indexOf(search);
        if(index==-1){
            System.out.println("The word '"+search+"' was NOT found");

        }else{
            System.out.println("The word '"+search+"' was found, it's "+index+" characters in");
        }
    }

    public static void reverse(){
        String rev = "";
        System.out.print("Please enter a word: ");
        String word = scan.nextLine();
        for(int i = word.length() -1; i>=0;i--){
            rev = rev+ word.charAt(i);
        }
        System.out.println("Result: "+rev);
    }




}
