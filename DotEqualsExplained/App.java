package DotEqualsExplained;


class Person {
    private int id;
    private String name;

    public  Person(int id, String name){
        this.id= id;
        this.name= name;
    }

    @Override
    public String toString() {
        return "Person [id= "+ id +", name= "+ name+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){return  false;} // for null pointer exception
        if(this == obj){ return  true;} // if the objects are the same content will be the same
        if(obj.getClass() != this.getClass()){ return false;} // class cast exception - if the are not the same class then you should not be able to compare
        // the object passed in will not have access to the id number or name for
        // comparisons sake, as 'obj' is referencing the object class. So in order to
        // get a variable reference that points to, in this case the Person class and its instance variables
        // we have to downcast.
        Person anotherPerson = (Person) obj; // now we have obj variable that we can use to access the id and name field of class person.
        if(this.id != anotherPerson.id){
            return false; // check 1 : if id is not the same then they are not equal
        }
        if(this.name == null){
            if(anotherPerson.name != null){
                return false; // null check for comparee name
            }
        }
        if(!this.name.equals(anotherPerson.name)){ // if names arent equal return false. also does the opposite of above null check,
            return  false;
        }
        return true; // passes all checks = equal. return true
    }


}

public class App{

    public static void main(String[] args) {
        Person person1 = new Person(8, "Bob");
        Person person2 = new Person(8, "Bob");
        System.out.println(person1 == person2); // output = false, we can see two different objects yet their values are the same, so why is it false?
        // looks to see what it is pointing at, not whats in it.
        //we can use the .equals method, however we would need to override it in our person class.
        // equals method is an inherited method for class object - object is the root class of of all classes, so all subclasses inherit its method
        // System.out.println(person1.equals(person2)); // this will still output false(at this point I have not implemented a equals method in class Person)

        //STRING VERSION - EQUALS
        String str1 = new String("bob");
        String str2 = new String("bob"); // when name was sue it was false - but when name is bob its is true.
                                                 // however the are two different objects - so different reference points(str1 and str2)
                                                 // Strings equals methods works differently - it has been overridden to look at content
        boolean value = str1.equals(str2);
        System.out.println(value);
        System.out.println(person1.equals(person2)); // true - as we have implemented a custom equals method

        //EXAMPLE 2
        //double value1 = 7.2;
        Double value1 = 7.2; // false
        //double value2 = 7.2;
        Double value2 = 7.2; // false D not d - Double is an object double a primitive value and in order to compare using == we would need to use .equal

        System.out.println(value1==value2);
    }
}
