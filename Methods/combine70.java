import java.util.ArrayList;

public class combine70{
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        
        System.out.println("List 1 has elements: "+list1 +" And List 2 and has elements: "+list2);
        combine(list1, list2);
        System.out.println("Combined");
        System.out.println(list1);
    }
    public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
    }
}