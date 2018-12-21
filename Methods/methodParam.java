import java.util.ArrayList;

public class methodParam{
    public static void main(String[] args){
        int number = 1;
        //addThrees(number); even though we are passing in a value to addThrees and returning a value the value in the main methods variable number
        //will still equal 1 - because this varible in main still does not know it was used or that this method addthrees exists
        number = addThrees(number); //this will overide or change the number variable in this method.
        System.out.println(number);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        removeList(list);//grabs the list above takes it into the method removeList and executes the method call, and the method does not return anything however the item is removed everywhere
        System.out.println(list.toString());
    }

    public static void addThree(int number){
        number = number + 3;
    }

    //We can make it work using the code above with a few changes

    public static int addThrees(int number){
        number = number + 3;
        return number;
    }

    //ArrayList

    /**
     * The above examples addThree & addThrees show how method variables within a class are independent and the only way they can be accessed is 
     * through the parameters.
     * the method addThree does not return anything, what it's actually doing taking the value 1 from main and adding it to 3 but nothing is returned.
     * the variable in the method has changed nothing else.
     * Both variables that are called 'number' are separate, therefore when the method addThree changes the value of its own variable called number it 
     * does not affect the variable number in the main program.
     * The parameters in the method are different to the ones called in the method body.
     * However this idea does not work in the same way for an ArrayList
     * ...if the method gets an ArrayList as a parameter the method sees the original list and all the changes the method makes will take effect everywhere
     * In Java only the values of primitive data types (which are int, double, char, boolean and a couple of others) get 
     * copied to the method. When the method parameters are of other types only the references are copied to the method.
     * These are called reference data types, see it as a pipe, for e.g the array list is shot down the pipe into the method removeList, removeList makes 
     * the changes and shoots it back up, now for primitive data types like int, its more like I have a number on a paper - 3 - i want to make changes to it
     * so i get another paper write 3 on it send it to the method, it makes the changes required sends the copied paper back with the changes, but the orginal 3 will stay 
     * the same now ive got a modified paper and a original 3, in order to to make changes to 3 i have to directly assign it the new value. 
     */

     public static void removeList(ArrayList<Integer> list){
         list.remove(0);//index 0 element removed
         //this is a void method it does not return anything but any list from any method put into it is affected globally
     }
}