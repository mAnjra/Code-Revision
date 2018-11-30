import java.util.Scanner;

public class Password{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String password = "penis";

        while(true){
            System.out.println("Please enter your password:");
            String answer = scan.nextLine();
            if(answer.equals(password)){
                System.out.println("Right!");
                scan.close();
                break;
            }else{
                System.out.println("Wrong!");
            }
        }

        

    }
}