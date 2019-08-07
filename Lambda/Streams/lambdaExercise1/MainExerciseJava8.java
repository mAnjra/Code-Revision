package lambdaExercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainExerciseJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //Step 1 sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));//comparator interface has only one method


        System.out.println("Printing everything using lambda from print conditionally");
        printCondtionally(people, p -> true); // *  here we pass in 'people' which is a list that is what the method
        // printConditionally wants in its first argument, second thing it wants is an instance of the condition interface
        // in java 8 we can use lambda instead of creating an inner class that is what we've done below, now with printing everything
        // if we pass in true then everything is printed, because the if statement in the method printConditionally always equals true,
        System.out.println("Printing only Last Names that start with C");
        printCondtionally(people, p -> p.getLastname().startsWith("C"));//so instead of an inner class you use a lambda expression

    }

    //Step 2 method that prints all names
    /* we can get rid of this method ans use above... *
    public static void printList(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }*/

    //Step 3 method that prints last name start with c
    public static void printCondtionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p.toString());
            }
        }
    }

}
