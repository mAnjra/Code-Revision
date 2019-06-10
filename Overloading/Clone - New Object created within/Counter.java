public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void grow() {
        this.value++;
    }

    @Override
    public String toString() {
        return "Value: " + value;
    }

    public Counter clone() {
        Counter clone = new Counter(this.value);// new objetc created, gets the value of the counter being cloned
        return clone;
    }

    public static void main(Strings[] args) {
        Counter counter = new Counter();
        counter.grow();
        counter.grow();

        System.out.println(counter); // prints 2

        Counter clone = counter.clone();

        System.out.println(counter); // prints 2
        System.out.println(clone); // prints 2

        counter.grow();
        counter.grow();
        counter.grow();
        counter.grow();

        System.out.println(counter); // prints 6
        System.out.println(clone); // prints 2

        clone.grow();

        System.out.println(counter); // prints 6
        System.out.println(clone); // prints 3

    }
}