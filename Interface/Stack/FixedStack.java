package Stack;

/**
 * Making an array work like a Stack
 */

public class FixedStack implements IntStack {
    private int stck[]; // variable for int array
    private int tos;

    // allocate and initialise a stack
    public FixedStack(int size){
        this.stck = new int[size];
        this.tos = -1; // if index is -2  we get IndexOutOfBoundsException - push prefix increments to index 0 if tos == -1
    }

    @Override
    public void push(int push) {
         if(tos==stck.length-1){ // tos will be incremented each time push is called, however if tos equals the length of stck[] then there is no space.
             System.out.println("Stack is full!");
         } else
             stck[++tos] = push; // stck[increment index 'tos'] add push to this index
    }

    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack Underflow"); // stack is empty nothing to call
            return 0;
        } else
            return stck[tos--]; // return stack[at index 'tos'] then decrement
    }
}
