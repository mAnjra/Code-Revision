package lambda101;

public class Greeter {

    /***
     * This class will show, how lambda functions can be used to replace annonymous classes = classes within classes
     * We want a method that greets, and says hello in more than one way. lambda101.Greeting requires performing a greet, so we
     * will creates an interface it will have the method perform. Now any other greet we want to create can be
     * created in a new class which implements our interface - and therefore the perform method - we will also use
     * a lambda funtion to create this as well
     */

    public void greet(Greeting greeting){
        greeting.perform();
    }


}
