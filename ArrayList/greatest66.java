import java.util.ArrayList;

public class greatest66{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The Greatest number is: "+greatest(list));
    }

    public static int greatest(ArrayList<Integer> dist){
        int g = 0;
        for(int i : dist){
            if(g<i){
                g=i;
            }
        }
        return g;
    }
}