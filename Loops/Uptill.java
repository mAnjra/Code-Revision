import java.util.Scanner;

public class Uptill{
     public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number for the loop: ");
        int uptill = Integer.parseInt(scan.nextLine());
        scan.close();
        int i = 0;

        while(i<=uptill){
            System.out.println(i);
            i++;
        }
     }
}
