import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        /*
         * Student pipsi = new Student("Pipsi Mikkola", "013141590");
         * System.out.println("Name: " + pipsi.name);
         * System.out.println("Student Number: " + pipsi.getStudentNumber());
         * System.out.println(pipsi);
         */

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String names = scan.nextLine();
            if (names.isEmpty()) {

                break;
            }
            System.out.print("Student Number: ");
            String stuNum = scan.nextLine();
            list.add(new Student(names, stuNum));
        }

        for (Student st : list)
            System.out.println(st);

        System.out.println("Give search term: ");
        String search = scan.nextLine();
        System.out.println("Result:");
       

        
        int i = 0;
        while(i < list.size()){
            Student nameSearch = list.get(i);//returns the element at the desired index
            String strNameSearch = nameSearch.getName();//gets the name ONLY and assigns it to strsearch
            if(strNameSearch.contains(search)){
                System.out.println(nameSearch);
            }
            i++;
        }
    }
}