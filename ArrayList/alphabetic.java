import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 * Arraylist Method - sort
 */
public class alphabetic{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Zodd");
        list.add("Matt");
        list.add("Fart");
        list.add("Azhar");
        Collections.sort(list);

        for(String i: list){
            System.out.println(i);
        }
    }
}