import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class ex36{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.000");//decimal format is subclass of numberformat, you can use decimal format

        int num = 0;
        int total = 0;
        int counter = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        

        System.out.println("Enter -1 to stop entering numbers");
        while(true){
            num = Integer.parseInt(scan.nextLine());
            
            if(num == -1){
                scan.close();
                System.out.println("Thank you see you later!");
                System.out.println("Here is the total= " + total);
                System.out.println("Here is how many numbers were entered: "+ counter);
                average = (double)total / (double)counter;// had to cast double on the two intger numbers, else output was rounded
                System.out.println("The average: "+ formatter.format(average));
                System.out.println("Even Numbers: "+ even);
                System.out.println("Odd Numbers: "+ odd);
                break;
            }else{
                total += num;
                counter++;
                if(num%2==0){
                    even++;
                }else{
                    odd++;
                }
                
                
                
            }
            
        }
        
        


    }
    /**
     * In these exercises we actually created one single program, 
     * but programming happened in very small steps. 
     * This is ALWAYS the preferred way to program.

    When you are programming something, no matter if it is an 
    exercise or a project of your own, it is advised to do it 
    in very tiny pieces. Do not ever try to solve the whole problem in one go. 
    Start with something easy, something you know that you can do. 
    In this recent set of exercises, for example, we focused first on stopping 
    the program when the user types -1. When one part of the program is 
    complete and working, we can move on to work out the solution 
    for the next sub-problem of the big main problem.

    Some of the exercises in this course are sliced into smaller pieces 
    like the set of exercises we just introduced. Usually the pieces need 
    to be sliced again into smaller pieces depending on the problem. 
    It is advised that you execute the whole program after almost every new line of code you write. 
    This enables you to be sure that your solution is going in the right and working direction.


     */
}