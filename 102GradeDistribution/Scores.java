import java.util.ArrayList;
import java.util.Scanner;

public class Scores {

    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Integer> stars = new ArrayList<>();
    int grade5, grade4, grade3, grade2, grade1, grade0;

    public Scores() {
    }

    public void enterScores() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter scores: (-1 to stop)");
        int i = Integer.parseInt(scan.nextLine());
        while (i != -1) {
            scores.add(i);
            i = Integer.parseInt(scan.nextLine());
        }
        scan.close();
    }

    public void printScores() {
        for (int i : scores) {
            System.out.println(i);
        }
    }


    public void printGradeDist() {
        int notAccepted = 0;
        for (int i : scores) {
            if (i >= 50 && i <=60) {
                this.grade5++;
            } else if (i >= 45 && i <50) {
                this.grade4++;
            } else if (i >= 40 && i <45) { 
                this.grade3++;
            } else if (i >= 35 && i<40) {
                this.grade2++;
            } else if (i > 30 && i<35) {
                this.grade1++;
            } else if( i >=0 && i<30){
                this.grade0++;
            }else{
                notAccepted++;
            }
        }
       
        stars.add(grade5);
        stars.add(grade4);
        stars.add(grade3);
        stars.add(grade2);
        stars.add(grade1);
        stars.add(grade0);

        int gradeCount = 5;
        System.out.println("Grade distribution:");
        for (int var : stars) {
            System.out.print("Grade " + gradeCount + ": ");
            for(int i =0; i<var;i++){
                System.out.print("*");  
            }
            gradeCount--;
            System.out.println("");
        }
        System.out.println("Not accepted(above 60) :" + notAccepted);
        
        int allscores = 0;
        int accepted = 0;
        for(int i = 0; i < stars.size();i++){
            allscores += stars.get(i); 
        }
        /* ONE WAY
        if(grade0 < allscores){
            accepted = allscores - grade0;
        }else{
            accepted = grade0 - allscores;
        }*/ 
        //SECOND WAY
        accepted  = Math.abs(allscores-grade0);
        //Third Way using the ternary operator 
        //accepted = accepted > grade0 ? accepted - grade0 : grade0 - accepted;

        float percentage = 100*(float)accepted/allscores;// casting one of two operands fixed my issue with the numbers after the decimal point not showing
                                                         // the cast has higher precedence than the division, so it happens before, the compiler will now change the 
                                                         // second operand to a float aswell, the rules say if one operand is of floating point type. it automatically
                                                         // becomes a foating point operation even if the other operand is int.                             
        System.out.println("Acceptance percentage: "+ percentage);

        

         
    }
}