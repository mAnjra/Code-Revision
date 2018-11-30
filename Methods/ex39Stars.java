
public class ex39Stars{
    public static void main(String[] args){
        //stars(5);
        //stars(4);
        //stars(3);
        //printSquare(100);
        printRect(3, 17);
        
    }



public static void stars(int r){
            //int i = 0;
            while(r!=0){
                System.out.print("*");
                r--;
            }
            System.out.println();//had to include this was not printing on a new line. 
            //after the while is completed a new line is created when the methid is called again.
        }

public static void printSquare(int s){
    int f = s*s;
    while(f!=0){
        System.out.print("*");
        f--;
        if(f%s==0)
        System.out.println();
    }  
}

public static void printRect(int height, int width){
    int rect = height*width;
    int counter = 0;
    //int y = width;
    while(rect!=0){
        System.out.print("*");
        rect--;
        counter++;
        if(counter==width){
            System.out.println();
            counter = 0;
        }
    }
}

public static void printTrin(int t){
    int i = 0;
    while(t!=0){

    }
}



}
            

