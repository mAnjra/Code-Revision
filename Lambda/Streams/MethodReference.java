import java.util.function.Consumer;

/**
 * When to use a method reference(alternative syntax)
 * examples below. Is a shorthand.
 */
public class MethodReference {

    public static void main(String[] args) {
        //Here we are passing method printMessage in our lambda expression
        //there is another way to do this, and this way is only compatible at certain times
        //when you are executing a method in your lambda expression, if what you are passing in with both the return
        //type and what is passed into the method, then you can use what is called a method reference.
        //Best explained with examples
        //Thread thread = new Thread(() -> printMessage());
        //METHOD REFERENCE
        //Thread threadM = new Thread(MethodReference::printMessage); // () -> method()
                                // call the static method by calling the class name then :: method

        //ANOTHER EXAMPLE
        String helloMain = "hello";
        printMessage(helloMain, p -> System.out.println(p));
        printMessage(helloMain, System.out::println); // p -> method(p) - see that, can replace with method ref
        /**
         * So the printMessage Method takes two arguments in its parameter, The first is String, so we pass in
         * helloMain, then we pass in consumer functional interface, this takes an argument and returns nothing,
         * in print message we call its abstract method - accept - and pass into its parameter our string. Now we have
         * two versions of the printMessage call. The first one is the normal way, our input  argument is p -> and we return void
         * which is our System.out.println(p) and we pass in p into sysout. As this time we have parameters, inputs, different to
         * the Thread example which had no inputs, if the input that is passed through is the same as what is returned then we could use the
         * method reference shorthand.
          */
    }


    public static  void printMessage(String p, Consumer<String> consumer){
        consumer.accept(p);
        //System.out.println("Hello");
    }

}
