public class Calculator {
    private Reader reader;
    private int stats = 0;
    private int value1, value2;

    public Calculator(){
        this.reader = new Reader();
    }

    private void values(){
        System.out.print("Value1: ");
        this.value1 = reader.readInteger();
        System.out.print("Value2: ");
        this.value2 = reader.readInteger();
        stats++;
    }

    private void sum() {
        values();
        System.out.println("sum of values: "+(value1+value2));
    }

    private void difference(){
        values();
        System.out.println("sum of values: "+(value1-value2));
    }

    private void product(){
        values();
        System.out.println("sum of values: "+value1*value2);
    }

    private void statistics(){
        System.out.println("Calculations done: " + stats);
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

}
