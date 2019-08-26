package AccessImpleThroughInterfaceRef;

/**
 * This class shows how we can use an interface that
 * is being implemented by a class as a reference for
 * that class. This way we can call the class' method(s)
 * before creating that class only the interfaces methods. The method to be executed
 * is looked up dynamically at run time, the calling code
 * will be able to call the classes method through the interface
 * without knowing anything about the class.
 *
 * Note: this incurs a significant overhead at run time, as it's being looked up dynamically.
 *       this should be avoided in performance critical code.
 */
public class Main {
    public static void main(String[] args) {
        // calling through the interface
        //Callback callback = new Client();
        //callback.callback(43); // note: we can only call this method not clients own methods.

        // polymorphic power
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42); // c here refers to the client class' version of the callback method
        c = ob; // c an interface type, now refers to the another client class' version of the callback method
        //if i get rid of the 'implements callback' from the 'AnotherClient' the above method obviously will not
        // work, as 'c' is type interface(Client) and can only have access to its methods implemented in AnotherClient
        c.callback(42);

        // calling through class itself - normal way
        Client client = new Client();
        client.callback(43);
        client.getNumber(); // output = 7, above interface reference, 'callback' does not have access to getNumber.

    }
}
