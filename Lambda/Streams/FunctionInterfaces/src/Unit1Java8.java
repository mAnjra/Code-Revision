import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Java8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //sort list by last name

        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Create a method that prints all elements in the list
        printConditionally(people, p -> true); // takes advantage of the boolean abstract method within Condition interface
        // in the method if the condition is always true then sysout will always be printed

        //Create a method that prints all people that have last name beginning with C
        //Instead of using the verbose inner class implementation, the lambda way makes it look cleaner
        //also notice p does not need brackets around it as the interface takes in one variable it's actually incorrect
        //to use brackets, also we don't need to specify p is of type person java infers this, Type inference.
        printConditionally(people, p -> p.getLastName().startsWith("C"));


    }

    //here we have created a condition interface, and passed it into the method param
    //Java however allows us to use one of its out of the box interfaces - called functional interfaces
    //so we don't have to create an interface in this case. we can simply use
    //the already made Predicate interface, this takes a generic and returns a boolean, which is exactly
    //what our condition method does.
    //so we can comment out this following method header:
    //private static void printConditionally(List<Person> people, Condition condition) {
    // now there is no need for the condition interface we created, as this out of the box method by java serves our purpose
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) { //predicate is a functional interface - it has  a method called test
                System.out.println(p);
            }

        }
    }

}

