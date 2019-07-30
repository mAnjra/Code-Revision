public class RunnableExample {
    /**
     * The interface runnable has one method that is why the below example will work.
     * here there will be two ways in which we can implement the runnable interfaces method
     * one way is to have an inner class - annonymous class - the other is lambda
     * the example shows why java decided to use interfaces with lambdas rather than create a whole
     * new function - backwards compatibility, using something that already exists within java, interfaces,
     * means libraries created wont need to be changed in order to use lambda functions. The only constraint
     * is these interfaces have one abstract method. These interfaces are called functional interfaces. with functional
     * interfaces it is also advised to use the annotation @FunctionalInterface - this tells any other developer the use case
     * for this interface so they wont add another abstract method and make the lambda expressions void - also brings up
     * an error.
     */
    public static void main(String[] args){

        //Below is a classic case where we can use a lambda.
        //We create a new thread and past to it an instance of runnable
        /*Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });


       // myThread.run();
        //Now with lambdas, we can get rid off all the code above, and infer to java runtime
        //what we want.
        */
        Thread lambdaThread = new Thread(() -> System.out.println("Printed using lambda"));
        lambdaThread.run();
        //Thread has to implement a runnable interface, but we pass in a lambda expression, that has the same
        //signature as the runnable interface run method. so we bypass creating an inner class.

        //Thread was implemented in java before java 8 - the java developers did'nt fix thread so it works with lambdas
        //they made it so lambdas work with the interfaces these classes use, as the lambda behaves the same way as these
        //interfaces - remember these interfaces need to only have one abstract method, take the same arguments and return the
        //same types.
    }
}
