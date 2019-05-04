

public class ClockMain {
    public static void main(String[] args) {
        Clockz clock = new Clockz(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}