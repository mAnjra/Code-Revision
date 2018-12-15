import java.util.ArrayList;

public class sumOf63{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println(sum(list));
        list.add(10);
        System.out.println(sum(list));
    }

    public static int sum(ArrayList<Integer> kist){
        int t = 0;
        for (int i : kist) {
            t = i+t;;
        }
        return t;
    } 
}