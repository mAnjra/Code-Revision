import java.util.Scanner;

public class limit{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a lower limit:");
        int lowerLimit = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter an upper limit:");
        int upperLimit = Integer.parseInt(scan.nextLine());
        scan.close();
       

        System.out.println("First: " + lowerLimit);
        System.out.println("Second: " + upperLimit);

        while(lowerLimit <= upperLimit){
            if(lowerLimit>upperLimit){
                System.out.println("Lower limit should be lower than upper");
                //break;
            }else{
            System.out.println(lowerLimit);
            lowerLimit++;
            }
        }


    }
}