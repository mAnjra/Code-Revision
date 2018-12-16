import java.util.ArrayList;

public class returnArrayList{
    public static void main(String[] args){
        //the way in which we return the value from the method into the variable 'number' can be done slightly different to instantiating a 
        //new blank list, it can however be done this way:
        //ArrayList<Integer> gist = new ArrayList<>();
        //gist = addItemToList(2, 2, 2);
        //this takes up two lines and is slightly verbose
        //A cleaner method is this:
        ArrayList<Integer> numbers = addItemToList(3, 2, 1);
        System.out.println(numbers.toString());
    }
                //Always type cast, dont forget, also this list has to return a value of ArrayList
    public static ArrayList<Integer> addItemToList(int num1, int num2, int num3){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(num3);

        return list;
    }


}