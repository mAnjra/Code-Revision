package GenericsExample;

public class Slot <T> { // after class name define how many types
    private T key;

    public Slot(T key){
        this.key = key;
    }

    public T getKey(){
        return this.key;
    }
}
