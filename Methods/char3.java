import java.util.Scanner;

public class char3{

    public static void main(String[] args){
        //char charachter = word.charAt(3);
        /*
        String charachter = word.charAt(3);
        System.out.println("The 3rd letter is: " + charachter);
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        scan.close();
   
        //Methods
        calChar(name);
        firstChar(name);
        lastChar(name);
        revString(name);
        int r = 1;
        //int g = name.length();
       
        for(int i = 0; i <= name.length()-1;i++){ 
           
            if(name.length()>=3){
                System.out.println(r+". Character: "+name.charAt(i));
                r++;
            }else{     
                System.out.println("Name not long enough");
                break;
        }
    }
    }

    public static void revString(String text){
        String rev = "";
        for(int i = text.length()-1; i >=0;i--){
            rev = rev + text.charAt(i);
        }
        System.out.println("Name in reverse: "+rev);
    }

    public static void calChar(String text){
        
        int i;
        for(i=0;i<=text.length()-1;i++){    
        }
        System.out.println("Your name is "+i+" charachters long");       
    }

    public static void firstChar(String text){
        char charachter = text.charAt(0);
        System.out.println("The first character is: "+charachter);
    }

    public static void lastChar(String text){
        System.out.println("Last charachter is: "+ text.charAt(text.length()-1));      
    }
}
