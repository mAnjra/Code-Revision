import java.util.ArrayList;

public class arePositive{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(-5);
        list.add(3);

        System.out.println("Are all the numbers on the list positive? "+ positive(list));

    }

    public static boolean positive(ArrayList<Integer> wist){
        boolean t = true;

        for(int i : wist){
            if(i<0){
                t = false;
            }
        }
        return t;
    }
}