package RichFirstPoorLast;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Guff", 18500);
        Person person2 = new Person("Fluff", 19000);

        int result = person1.compareTo(person2);

        if(result > 0 ) {
            System.out.println(person1.getName() + " is richer than " + person2.getName());
        } else if (result < 0 ){
            System.out.println(person2.getName() + " is richer than " + person1.getName());
        }else
            System.out.println("No ones richer");
    }
}
