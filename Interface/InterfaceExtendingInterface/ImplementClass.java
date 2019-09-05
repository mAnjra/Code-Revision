package InterfaceExtendingInterface;

/**
 * As interface B extends interface A, when we implement interface B
 * we also have to implements interface A's methods.
 */

public class ImplementClass implements B {

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}
