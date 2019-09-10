package DefaultMethod;

public interface DefaultImplementation {

    // usual way to define methods in interfaces
    int getNumber();

    // default method implementation
    default String getString(){ // like normal method declaration within classes - instead use keyword default
        return "Default String";
    }
    // if an implementing class does not decide to implement this method the default is used.
    // the primary reason this was introduced - is a way to add methods to existing interfaces without breaking the classes
    // that implement them.
    
    // Static interface method - no instance of interface needed in order to call it
    // static interface methods are not inherited by an implementing class
    static int getDefaultNumber(){
    return 0;
    }
}
