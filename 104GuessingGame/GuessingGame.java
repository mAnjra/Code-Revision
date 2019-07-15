import java.util.Scanner;

public class GuessingGame {

    private Scanner reader = new Scanner(System.in);

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit,upperLimit );
        
        int search = average(lowerLimit, upperLimit);
        while(lowerLimit!=upperLimit){
            System.out.println("Is your number greater than " + search+"? (y/n)");
            String answer = reader.nextLine();
            if(answer.equals("y")){
                lowerLimit = search + 1;
            }else if (answer.equals("n")){
                upperLimit = search;
            }
            search = (lowerLimit+upperLimit)/2;
        }
        System.out.println("The number you're thinking off is " + lowerLimit);
    }


    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int number){
        System.out.println("Is your number greater than "+ number+"? (y/n)");
        if(this.reader.nextLine().equals("y")){
            return true;
        } 
        return false; 
    }

    public int average(int firstNumber, int secondNumber){
        int average = (firstNumber+secondNumber)/2;
        return average;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number)//6 {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}