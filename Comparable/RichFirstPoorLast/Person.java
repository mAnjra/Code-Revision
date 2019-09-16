package RichFirstPoorLast;

public class Person implements Comparable{ // if person is not added we use Object and class cast
    private String name;
    private int salary;

    public Person(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object person) {
        // class cast if we don't add <Person> after comparable

        Person person1 = (Person) person;
        return this.salary - person1.getSalary();
    }
}
