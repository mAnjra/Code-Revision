import java.util.ArrayList;
import java.util.Scanner;

public class Runtime {

    ArrayList<Bird> birds = new ArrayList<Bird>();
    Scanner scan = new Scanner(System.in);

    public void scan() {
        String answer = " ";
        while (!answer.equalsIgnoreCase("Quit")) {
            System.out.print("? ");
            answer = scan.nextLine().trim();
            if (answer.equalsIgnoreCase("ADD")) {
                add();
            } else if (answer.equalsIgnoreCase("OBSERVATION")) {
                observation();
            } else if (answer.equalsIgnoreCase("STATISTICS")) {
                statistics();
            } else if (answer.equalsIgnoreCase("Show")) {
                show();
            }
        }
    }

    public void show() {
        System.out.print("What? ");
        String answer = scan.nextLine().trim();
        for (Bird b : birds) {
            if (answer.equalsIgnoreCase(b.getName())) {
                System.out.println(b.statistics());
            }
        }
    }

    public void add() {

        System.out.print("Name: ");
        String name1 = scan.nextLine().trim();

        System.out.print("Latin Name: ");
        String latinName1 = scan.nextLine().trim();

        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equalsIgnoreCase(name1)) {
                System.out.println("Bird already exist");
                return;
            }
        }
        birds.add(new Bird(name1, latinName1));
    }

    public void statistics() {
        for (Bird b : birds) {
            System.out.println(b.statistics());
        }
    }

    public void observation() {
        System.out.print("What was observed:? ");
        String answer = scan.nextLine().trim();
        for (Bird b : birds) {
            if (b.getName().equalsIgnoreCase(answer)) {
                b.increaseOb();
                return;
            }
        }
        System.out.println("Bird not in Database!");
    }
}
