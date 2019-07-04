import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample1{
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
            new Person("Fiercefil", "Droptoe", 24),
            new Person("Mo", "Doe", 28),
            new Person("Charlie", "Darley", 32),
            new Person("Gaynum", "Riverstead", 78),
            new Person("Stainlow", "FeeBoard", 53));

        //Both have the same function
        //people.forEach(p -> System.out.println(p));
        System.out.println("Printing list using for each lambda:");
        people.forEach(System.out::println);
        System.out.println();
        //this is same as people.forEach(p -> System.out.println(p));  above is a method reference as their is an element p which is simply
        // being passed through.

        //printing person that have their last name start with 'D'
        //now we can go through the array using a external iterator: a for each loop
        //this is where you choose the limits of the loop, above we used an internal operator where java runtime decides how to loop or in that case print out
        
        //STREAMS
        System.out.println("Using Streams and its methods:");
        people.stream()
        .filter(p -> p.getLastName().startsWith("D"))
        .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream() //this is called a source. We've added it to a local variable to print it out
        .filter(p -> p.getLastName().startsWith("D")) // this is the intermediate operation. 
        .count();// this is terminal operation - ends the stream, cant have anyhting after it.
        System.out.println(count);//

        people.parallelStream()//a parallel stream will maybe split operation to, two different cores to speed up compile time - potentially - its the same as a stream, but possibly decides to speed
        .filter(p -> p.getLastName().endsWith("d"))
        .forEach(System.out::println);
    }

}