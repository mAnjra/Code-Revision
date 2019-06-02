
public class Main{
    public static void main(String[] args){
        /*
        Person6 person1 = new Person6("Pekka Mikkola", "109-403");

        System.out.println(person1.getName());
        System.out.println(person1.getNumber());

        System.out.println(person1);
        person1.changeNumber("209-503");
        System.out.println(person1);
        */

        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka", "34");
        phonebook.add("Gee", "78");
        phonebook.add("Bon", "21");

        //phonebook.printAll();

        System.out.println(phonebook.searchNumber("Pekka"));
    }
}