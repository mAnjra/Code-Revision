public class Main{
    public static void main(String[] args){
        DecreaseCounter counter = new DecreaseCounter(10);

        counter.print();
        counter.decreaseValue();
        counter.print();
        counter.decreaseValue();
        counter.print();
    }
}