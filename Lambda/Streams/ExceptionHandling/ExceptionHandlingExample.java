package ExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int key = 0;

        process(numbers, key, (v, k) -> System.out.println(v+k));
        //using lambda we can have the same method do different things
        process(numbers, key, (v, k) -> System.out.println(v*k));

        //ERROR - Arithmetic exception - key is 0 - so where do we handle the exception? we can use try catch in the method but...
        //process(numbers, key, (v, k) -> System.out.println(v / k));

        //we could try it within the lambda call - not a single line so we have to put it in braces
        process(numbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            }catch (ArithmeticException e){
                System.out.println("Arithmetic exception happened");
            }
        });


    }

    public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer){
        for(int i : numbers){
            //System.out.println(i+key);//the operation is defined in the method #restrictive - using lambda can help
            biConsumer.accept(i,key);

            //* We could try it here - but biConsumer does not know in this method how it's being implemented in the method lambda call
            /*
            try {
                biConsumer.accept(i,key);
            }catch (ArithmeticException e){
                //do something
            }
            */
            // What if there is another type of exception and not Arithmetic.

        }
    }
}
