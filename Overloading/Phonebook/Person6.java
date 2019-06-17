public class Person6 {
    String name;
    String num;

    public Person6(String name, String num) {
        this.num = num;
        this.name = name;
    }

    public Person6() {
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.num;
    }

    public void changeNumber(String num){
        this.num = num;
    }

    public String toString() {
        return "Name: " + this.name + ", Number: " + this.num;
    }

}