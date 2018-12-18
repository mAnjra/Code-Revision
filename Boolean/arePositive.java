import java.util.ArrayList;

public class arePositive{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(-5);
        list.add(3);

    
        System.out.println("Are all the numbers on the list positive? "+ positivity(list));

    }

    public static boolean positive(ArrayList<Integer> wist){
        boolean t = true;//helper variable inside this method hmmm is there a better a way?*look below

        for(int i : wist){
            if(i<0){
                t = false;
            }
        }
        return t;
    }

    /**
     * By calling the return call within the if statement you can cut the method short if
     * there is a NEGATIVE number in the list - why go through all of them ? return false simples
     */

     public static boolean positivity(ArrayList<Integer> eist){
         for(int f : eist){
             if(f<0){
                 return false;
             }
         }
         return true;
     }
       
}
