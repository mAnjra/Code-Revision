public class Person{
    String firstName;
    String lastName;
    int age;
    
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //MyLambda getFirstName = () -> this.firstName; // java needs a variable type so we cant leave it as getFirstName, we have to create a interface for it
                                                  // each different type of lambda expression requires a different interface, for example the below add one.
    //AddLambda addFunction = (int a, int b) -> a+b; 

    public String getFirstName(){
        return this.firstName;
   }

    public String getLastName(){
        return this.lastName;
    }

    public String toString(){
        return firstName + " " + lastName + " " + age;
    }
}

interface MyLambda{
    String noArg();
}

interface AddLambda{ // this now helps functions that return an int, and take two int's as arguments
    int add(int a, int b);
}