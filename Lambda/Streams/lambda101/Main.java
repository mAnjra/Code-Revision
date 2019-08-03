package lambda101;

import lambda101.Greeter;
import lambda101.Greeting;

public class Main {
    public static void main(String[] args){
        Greeter greeter = new Greeter();

        //ONE WAY TO DO IT

        //Annonymous class -
        Greeting greeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello");
            }
        };

        //USING LAMBDA
        Greeting lambdaGreeting = () -> System.out.println("Hello");
        //this only works because interface has
        // similar signature to this, that is
        // both take no arguments and both return nothing, if that was not the case we would need a new interface
        // for it. If i get rid of greeting from out lambda function it would need an interface to support it, as java
        // needs a variable type.


        //Both ways have same output
        greeter.greet(lambdaGreeting);//both are connected to our interface lambda101.Greeting
        greeter.greet(greeting);


    }

}
