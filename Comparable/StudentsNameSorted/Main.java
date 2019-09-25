package StudentsNameSorted;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("guff");
        Students student2 = new Students("fuff");

        int results = student1.compareTo(student2);

        System.out.println("Minus values = precedes string argument\nPositive value = follows string argument\n "+results);

        if(results < 0){
            System.out.println(student1.getName()+", "+ student2.getName());
        } else if (results > 0){
            System.out.println(student2.getName()+", "+ student1.getName());
        } else
            System.out.println("They are equal");
    }

}
