
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {

        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age" + this.age + " years");
    }

    public void becomeOlder() {
        this.age += 1;
    }

    public boolean isAdult() {
        return this.age >= 18;

        /*
         * It can also be done this way - slightly verbose if(this.age<18){ return false
         * }
         * 
         * return true
         */
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public double bodyMassIndex() {
        double heightDividedByHun = this.height / 100.0;
        return this.weight / (heightDividedByHun * heightDividedByHun);
    }

    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }

}