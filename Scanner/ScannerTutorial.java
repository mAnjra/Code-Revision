import java.util.Scanner;



public class ScannerTutorial{

public static void main(String[] args){
    

    //READING IN STRING and INTEGER

    //new scanner instantiated with a variable named 'scan'
    Scanner scan = new Scanner(System.in);
    
    //STRING
    System.out.println("What is your name?");
    String answer = scan.nextLine(); // the input option that scan.next int will give, goes straight intovaraible answer.
    
    //INTEGER
    System.out.println("What is your age");
    //int age = scan.nextInt();// here is one way to do it. please look at the text file in this folder(Scanner), where there is additional information about nextLine and nextInt().
    int age = Integer.parseInt(scan.nextLine());
    
    

    System.out.println("Your name is: " + answer);
    System.out.println("Age: "+age);
    
    

    System.out.println("Please enter a number: ");
    int number1 = Integer.parseInt(scan.nextLine());
    System.out.println("Please enter another number: ");
    int number2 = Integer.parseInt(scan.nextLine());
    scan.close();
    if(number1 > number2){
        System.out.println(number1+" is the bigger number!");
    }else{
        System.out.println(number2+" is the bigger number!");
    }

}




}