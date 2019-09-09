package DefaultMethod;

public class DefaultImplementationClass implements DefaultImplementation {

    // Don't need to add default method - you can add the method if you want, and override it
    @Override
    public int getNumber() {
        return 0;
    }
    @Override
    public String getString(){
        return "Overridden Interface  Default Method String";
    }

}
