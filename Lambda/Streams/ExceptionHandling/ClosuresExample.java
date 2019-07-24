package ExceptionHandling;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;

        //The idea here is b does not exists within process method so why does it work?
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                //b =20; this would bring an error as b is no longer final or effectively final
                System.out.println(a+b);//b works here because it is effectively final - java comp knows or hopes it will not change
                //below I try to change b and b here gets an error.
            }
        });
        //b = 20; this line creates an error within the process inner class for b - says it is no longer final or effectively final
        //java comp in java8 relies on user to say if variable is final or not, however it allows the user to use a frozen version of the value
        //of b which is 40, as b does not exists within the process class, 'a' was passed in 'b' was not so why does it work? it works because
        //java 8 has effectively final - as long as the value does not change it will work.

        //Lambda Version
        doProcess(a, i -> System.out.println(a+b));

    }

    public static void doProcess(int i, Process process){
        process.process(i);
    }

}
interface Process{
    void process(int i);
        }
