import java.util.ArrayList;

public class removeLast62{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("from");
        list.add("top");
        list.add("home");
        System.out.println(list.toString());
        System.out.println("After deletion");
        removeLast(list);
        System.out.println(list.toString());
    }
    public static void removeLast(ArrayList<String> hist){
        int t = hist.size()-1;
        hist.remove(t);
    }
}