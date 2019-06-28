import java.util.ArrayList;
import java.util.Scanner;

public class Grades{
    public static void main(String[] args){
        Scores scores = new Scores();
        scores.enterScores();
        scores.printScores();
        scores.printGradeDist();
    }
}