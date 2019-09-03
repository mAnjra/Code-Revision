package Stack;

public class Main {
    public static void main(String[] args) {
        /*
        FixedStack stack1 = new FixedStack(5);
        stack1.push(3);
        stack1.push(2);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

         */

        DynStack stack2 = new DynStack(2);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3); // stack doubled

        //pop 4 times
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());

        // Polymorphism - using interface variable reference
        // one variable used - access to many implementations
        IntStack myStack;
        DynStack dyanmicStack = new DynStack(5);
        FixedStack fixedStack = new FixedStack(5);

        // load a dynamic stack
        myStack = dyanmicStack;
        for(int i = 0; i < 11 ;i++) myStack.push(i); // pushing using DynStack implementation
        myStack = fixedStack;
        for(int i = 0; i < 6; i++) myStack.push(i); // pushing using Fixed Stack implementation
        
        // Popping
        System.out.println("Dynamic Stack: ");
        myStack = dyanmicStack; // go back to Dynamic stack
        for(int i = 0; i < 11; i++) System.out.println(myStack.pop());

        System.out.println("Fixed Stack:");
        myStack = fixedStack;
        for(int i = 0; i < 6; i++) System.out.println(fixedStack.pop());

    }


}
