import java.util.ArrayList;

/**
 * Arraylist also works with numbers - however
 * there are some slight differences, <Integer> instead of using int
 * also being careful of indexes
 */
public class arrListNumbers101{
    public static void main(String[] args){
        ArrayList<Integer> t = new ArrayList<>();
        t.add(1);
        t.add(5);
        //Remove
        t.remove(5);//straightforward - trying to remove 5 from the list this way will not work - there is no index 5 in a list of only two elements
        //...instead we use this
        t.remove(Integer.valueOf(5));

        //arraylist also supports:
        ArrayList<Double>    d = new ArrayList<>();
        ArrayList<Character> c = new ArrayList<>();
    }
}