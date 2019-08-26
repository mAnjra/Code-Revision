package AccessImpleThroughInterfaceRef;

public class Client implements  Callback {
    private int number = 7;
    @Override
    public void callback(int p) { // return type: void. parameter: yes(int)
        System.out.println("callback called with: " +p);
    }

    public int getNumber() {
        return number;
    }
}
