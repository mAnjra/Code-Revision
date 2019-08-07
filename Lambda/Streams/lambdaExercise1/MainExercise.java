package lambdaExercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MainExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        //Step 1 sort list by last name
        java.util.Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        printList(people); // Prints a list of sorted people

        printLastNameC(people, new Condition() { //uses our inline interface condition to test if
            @Override
            public boolean test(Person p) {
                return p.getLastname().startsWith("C");
            }
        });

        printLastNameC(people, (p) -> p.getLastname().startsWith("C"));

    }

    //METHODS

    //Step 2 method that prints all names
    public static void printList(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }

    //Step 3 method that prints last name start with c
    public static void printLastNameC(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {//here instead of explicitly saying what we want, we put that into condition, which is implemented when its called
                System.out.println(p.toString());
            }
        }
    }


}

interface Condition{
    boolean test(Person p);
}
