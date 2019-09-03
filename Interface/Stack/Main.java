package Stack;

public class Main {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        stack1.push(3);
        stack1.push(2);
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }


}
