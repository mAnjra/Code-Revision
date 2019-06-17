import java.util.ArrayList;
import java.util.Arrays;


public class Phonebook {

    ArrayList<Person6> book = new ArrayList<Person6>();


    //NO NEED FOR CONSTRUCTOR - JAVA WILL CREATE ONE IF ONE IS NOT DECLARED

    public void add(String name, String number){
        Person6 person = new Person6(name, number);
        this.book.add(person);
    }

    public void printAll(){
        System.out.println(Arrays.toString(book.toArray()));
    }

    public String searchNumber(String name){
        for(String p : book){
            if(p.getName().equals(name)){
                return p.getNumber();
             
            }
        }
        return "Number not Known";
    }
    

}