import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import com.sun.corba.se.impl.orbutil.graph.NodeData;

public class Temperature{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        

        while(true){
            System.out.println("Enter a temperature:");
            double double1 = Double.parseDouble(scan.nextLine());
            
            if(double1 >40 || double1 < -30){
                System.out.println("Out of bounds enter a value between: \n -30 and 40");// \n is is a special character 
            }else{
                System.out.println("Thank you Temperature updated");
                scan.close();
                break;
            }
            
            
            
        }



    }
}