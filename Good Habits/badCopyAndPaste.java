import java.util.ArrayList;

/**
 * Good Habits - look for occurrences of copy and paste in your code, like this
 * example why print twice in your main when you can create a printing method
 * that can be called whenever printing is needed. - Also Alt+shift+f sorts out indentation
 */
public class badCopyAndPaste {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);

        System.out.println("The numbers in the beginning:");
        /*
        //printing twice
        for (int number : numbers) {
            System.out.println(number);
        }REPLACE WITH*/
        printing(numbers);

        while (numbers.contains(Integer.valueOf(3))) {
            numbers.remove(Integer.valueOf(3)); // if yes, it is removed
        }

        System.out.println("The numbers after removal:");
        /*
        //same code again printing twice
        for (int number : numbers) {
            System.out.println(number);
        }AGAIN REPLACE WITH*/
        printing(numbers);
    }
    //CREATE A PRINTING MEHTOD INSTEAD WHICH YOU CALL I MAIN
    public static void printing(ArrayList<Integer> list){
        for(int i : list){
            System.out.println(i);
        }
    }
}