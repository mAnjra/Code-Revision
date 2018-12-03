import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Average implements Serializable{

    

	private static final long serialVersionUID = 1L;

	public static void main (String args[]){


        ArrayList<Integer> weight = new ArrayList<Integer>();
        
        int average = 0;

        try {
            FileInputStream fileInput = new FileInputStream("data.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInput);
            weight = (ArrayList<Integer>) inputStream.readObject();
            inputStream.close();   
            fileInput.close();
            } catch (IOException e) {
                e.printStackTrace();  
            } catch (ClassNotFoundException c){
                System.out.println("Average Class not found");
                c.printStackTrace();
                
            }


        //int[] weight = {77, 80, 79, 90};
              
                   
            
            Scanner scan = new Scanner(System.in);
        try {
            FileOutputStream fileOutput = new FileOutputStream("data.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);  

            while(true){   
            System.out.println("Do you want to enter you weight today?: Yes/No"); 
            String answer2 = scan.next();
            if(answer2.equals("No") || answer2.equals("no")){
                System.out.println("Here are the previous weights: " + weight.toString());
                scan.close();
                outputStream.close();
                fileOutput.close();
                break;
            }else{    
            System.out.println("Please enter your weight:");
            weight.add(scan.nextInt());
            outputStream.writeObject(weight);
            outputStream.close();
            }   
            System.out.println("Do you want to add more weights? Yes/No");
            String answer = scan.next();

            if(answer.equals("No") || answer.equals("no")){
                System.out.println("----------------------------");
                System.out.println("Here are the previous weights: " + weight.toString());
                scan.close();
                fileOutput.close();
                break;
            }else{
                System.out.println("Add more weights");
            }
            }
        } catch (IOException e) {
                e.printStackTrace();
                return;
                }

        //R GETS REASSIGNED FOR-EACH ELEMENT IN WEIGHT(data structure)
        for(int r : weight){ 
            average += r;
            //..so R is assigned to each element, example first element in 
            //weight data structure, then we add average and the first element of weight
            //which is now in r 77, then r is reassigned again to the second element
            //so on... for each loop will end when all elements have been assigned
        }
        System.out.println("Average weight: "+ average/weight.size());
        


    
    }






/*DEAD CODE
for(i = 0; i<4;i++){
        average += weight[i]; 
        //average /= i; 

    }    

//average = average / r; IGNORE WRONG

*/
}