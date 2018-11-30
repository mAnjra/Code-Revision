import java.util.Random;
import java.util.Scanner;

public class ex41guess{
    
    public static void main(String[] args){
        
        
        Guess();
    }
    private static int drawNumber(){
        return new Random().nextInt(101);
        //this method will create a random number
    }

    public static void Guess(){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please guess a number:");
    int number = drawNumber();
    //System.out.println(number);   
    int counter = 1;
    int guessNum = 0;
        guessNum = Integer.parseInt(scan.nextLine());
        
        while(guessNum != number){
            counter++;
        if(guessNum<number){
            System.out.println("The number is greater");
        }else if(guessNum>number){
        System.out.println("The number is lesser");
        }
        else{
            scan.close();
            break;
        }
        guessNum = Integer.parseInt(scan.nextLine());
        

    }System.out.println("Congratulation you have guessed correctly!");
    System.out.println("It took you "+ counter+ " guesses");
}}