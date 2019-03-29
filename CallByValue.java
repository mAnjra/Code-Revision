class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);// value will be the same - because the values of a and b will be 'COPIED' , in
                      // order to change it here
                      // we have to pass the modifed copied values into the inital values.

        System.out.println("a and b after call: " + a + " " + b);

    }
}