import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
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
        System.out.println("Printing all names:");
        printConditionally(people, p -> true, p -> System.out.println(p)); // takes advantage of the boolean abstract method within Condition interface
        // in the method if the condition is always true then sysout will always be printed

        //Create a method that prints all people that have last name beginning with C
        //Instead of using the verbose inner class implementation, the lambda way makes it look cleaner
        //also notice p does not need brackets around it as the interface takes in one variable it's actually incorrect
        //to use brackets, also we don't need to specify p is of type person java infers this, Type inference.
        System.out.println("Printing all persons with last name beginning with 'C'");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("Printing Only first names beginning with 'C'");
        printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
        //Above we have more control as to what is printed - we use the same methods for all 3 operation but what is passed
        //when we call the method is changed using a lambda expression.
    }

    //here we have created a condition interface, and passed it into the method param
    //Java however allows us to use one of its out of the box interfaces - called functional interfaces
    //so we don't have to create an interface in this case. we can simply use
    //the already made Predicate interface, this takes a generic and returns a boolean, which is exactly
    //what our condition method does.
    //so we can comment out this following method header:

    //private static void printConditionally(List<Person> people, Condition condition) {

    // now there is no need for the condition interface we created, as this out of the box method by java serves our purpose
    // However lets comment this header out and make it better by using another function interface.

    //private static void printConditionally(List<Person> people, Predicate<Person> predicate) {

    //At this point the method will print p and if for example you wanted to print the first name only you would have to change
        //  the method
        //  there is another way  to do this, where we pass a out of the box function interface, in this case Consumer<T>
        //  this takes in an object and returns nothing - so we can pass in sysout and say for example when we call the
        //  the method lambda expression that we want to only return the first name.

        private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        //Consumer has an abstract method called accept, this takes one input argument and returns nothing
            // now we simply call this within the class.
            for (Person p : people) {
            if (predicate.test(p)) { //predicate is a functional interface - it has  a method called test
                consumer.accept(p);//what we want here is defined in the lambda expression when the method is called - above
            }

        }
    }

}

