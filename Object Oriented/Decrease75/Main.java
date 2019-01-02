public class Main{
    public static void main(String[] args){
        DecreaseCounter counter = new DecreaseCounter(2);

        counter.print();
        counter.decreaseValue();
        counter.print();
        counter.decreaseValue();
        counter.print();
        counter.decreaseValue();
        counter.print();//no when counter gets to 0 it stops
    }
}
