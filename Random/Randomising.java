import java.util.Random;

public class Randomising{
    public static void main(String[] args){
        Random randomiser = new Random();//Creates a Random generator
        int i = 0;

        while(i < 10){
            System.out.println(randomiser.nextInt(10));//bounded from 0 to number stated
            i++;
        }
    }
}