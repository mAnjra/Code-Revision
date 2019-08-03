package lambda101;
@FunctionalInterface //this tells developers this is a interface with only one abstract method - it will/is probably supporting
                     //a lambda expression.
public interface Greeting {
    public void perform();
}
