package Stack;

public class DynStack implements IntStack {
    private int stck[];
    private int index;

    public DynStack(int size){
        this.stck = new int[size];
        this.index = -1;
    }

    @Override
    public void push(int push) {
        if(index==stck.length-1){ // if stck is full double it and push number to stack
            int doubleStack[] = new int[stck.length * 2];
            // now to add old elements into this new doubled stack
            for(int i = 0; i <stck.length; i++){
                doubleStack[i] = this.stck[i]; // elements from stck index i... will be added it the new doubled stack
            }
            this.stck = doubleStack;
            this.stck[++index] = push; // increment index and add value to array
        } else
            this.stck[++index] = push;
    }

    @Override
    public int pop() {
        if(index < 0){
            System.out.println("Stack is empty");
            return 0;
        } else
            return this.stck[index--]; // index is pointing at last place item was added, retrieve this and decrement its position
    }
}
