package NationalService;

/***
 * Basic set-up to test classes - main point here is the basic use of interfaces
 * in the two classes - interfaces are contracts, implementation is done within
 * classes that implement
 */

public class Main {
    public static void main(String[] args) {
        CivilService cs = new CivilService();
        System.out.println("Number of days left: "+cs.getDaysLeft());

        for(int i = 0; i<363; i++){
            cs.work();
        }
        System.out.println("Number of days left: "+cs.getDaysLeft());

        System.out.println("// Military Service: ");
        MilitaryService ms = new MilitaryService(20);
        System.out.println("Military Service days left: "+ ms.getDaysLeft());
        for (int i = 0; i<22; i++){
            ms.work();
            System.out.println(ms.getDaysLeft());
        }

    }
}
