import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /**
         * If the size of the array isn't always the same, and requires user input for example in order to create the size
         * the size can be added to a variable: 
         */
        int cells = 99;
        int[] array = new int[cells];

        if(array.length == cells){
            System.out.println("The length of the array is " + cells);
        }else{
            System.out.println("Somthing unreal happened. The length of the array is something else than "+ cells);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Array Size: ");
        int size = Integer.parseInt(scan.nextLine());
        
        int[] values = new int[size];// user input defined array

        System.out.println("Enter values: ");
        for(int i = 0; i< size; i++){
            values[i] = Integer.parseInt(scan.nextLine());//user input added to index i - (i -index- controlled by for loop) 
        }
        
    }
}