import java.util.Random;

public class ex41guess{
    
    public static void main(String[] args){
        drawNumber();
        Guess();
    }
    private static int drawNumber(){
        return new Random().nextInt(101);
        //this method will create a random number
    }

    public static void Guess(){
        Scanner guessNum = new Scanner(System.in);
        
        while(guessNum != drawNumber()){
        if(guessNum<drawNumber()){
            System.out.println("The number is greater");
        }else if(guessNum>drawNumber()){
        System.out.println("The number is lesser");
        }
        guessNum = new Scanner(System.in); 
        

    }System.out.println("Congratulation you have guessed correctly!");
}}