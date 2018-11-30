import java.util.Scanner;

public class ex38{

    public static void main(String[] args){
        looper();  
    }

    public static void printext(){
        System.out.println("In the beginning there was the swamp, the hoe and Java.");
    }

    public static void looper(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many times you want loop to run: ");
        int howMany = Integer.parseInt(scan.nextLine());
        scan.close();
        
        for(int i = 0;howMany>i;howMany--){
              printext();
        }
    }
}
