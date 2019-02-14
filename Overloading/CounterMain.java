public class CounterMain{
    public static void main(String[] args){
        Counter counter = new Counter();
        int i = 0;
        counter.increase();
        counter.increase();
        counter.increase();
        while(i<10){
           counter.decrease();
           System.out.println(counter.value()); 
           i++;
        }
        
    }
}