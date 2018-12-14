import java.util.ArrayList;

public class amountOfItems61{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Halo");
        list.add("Join");
        list.add("Party");
        System.out.println("There are this many items in the list: "+countItems(list));

    }

    public static int countItems(ArrayList<String> gist){
        int count = 0;
        for(String g: gist){
            count++;
        }
        return count;
    }
}