package NestedInterface;

/**
 * Nested interfaces need to be firstly called by the name
 * of the class they exist in, then its name.
 */

public class Main {
    public static void main(String[] args) {
        // nested interface reference
        A.nestedIF nif = new B(); // a nested interface has to always be called using the class name
        // as class B implements this interface we can use it as a variable type, so no 'nif' is assigned a reference to object B
        if(nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }
        if(!nif.isNotNegative(-10)){
            System.out.println("10 is negative");
        }
    }
}
