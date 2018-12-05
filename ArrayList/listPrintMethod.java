import java.util.ArrayList;
/**
 * here we pass in an arraylist into a parameter for
 * printing
 */

public class listPrintMethod{

public static void print(ArrayList<String> printer){//the variable passed in the parameter can have any name
    for(String i: printer){
        System.out.println(i);
    }
}
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Wolf Cola");
        list.add("Pepsi");
        list.add("Sprite");

        ArrayList<String> list2 = new ArrayList<>();
        list.add("Snickers");
        list.add("Mars");
        list.add("Topic");

        print(list);
        print(list2);
        //as you can see you can pass any string list into the parameters 
    }
}