import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Java7 {

        public static void main(String[] args) {

            List<Person> people = Arrays.asList(
                    new Person("Charles", "Dickens", 60),
                    new Person("Lewis", "Carroll", 42),
                    new Person("Thomas", "Carlyle", 51),
                    new Person("Charlotte", "Bronte", 45),
                    new Person("Matthew", "Arnold", 39)
            );

            // Step 1: Sort list by last name
            Collections.sort(people, new Comparator<Person>() { // comparator is a functional interface - means it has one abstract method
                @Override
                public int compare(Person o1, Person o2) { // here this is called an anonymous class - or inner class
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            });

            // Step 2: Create a method that prints all elements in the list
            System.out.println("Printing all persons");
            printAll(people);

            // Step 3: Create a method that prints all people that have last name beginning with C
            System.out.println("Printing all persons with last name beginning with C");
            printConditionally(people, new Condition() {
                @Override
                public boolean test(Person p) {
                    return p.getLastName().startsWith("C");
                }
            });

            System.out.println("Printing all persons with first name beginning with C");
            printConditionally(people, new Condition() {
                @Override
                public boolean test(Person p) {
                    return p.getFirstName().startsWith("C");
                }
            });

        }

        private static void printConditionally(List<Person> people, Condition condition) {
            for (Person p : people) {
                if (condition.test(p)) {
                    System.out.println(p);
                }

            }

        }

        private static void printAll(List<Person> people) {
            for (Person p : people) {
                System.out.println(p);
            }

        }

    }

//here we create an interface that returns a boolean and takes in a Person object
    interface Condition {
        boolean test(Person p);
    }

