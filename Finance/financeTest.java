import java.util.Scanner;

public class financeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your current balance: ");
        double balance = Double.parseDouble(scan.nextLine());

        System.out.print("Please enter item amount: ");
        double amount = Double.parseDouble(scan.nextLine());

        System.out.print("Weekly Income: ");
        double weeklyIncome = Double.parseDouble(scan.nextLine());
        scan.close();

        if (weeklyIncome != 0) {
            double dayz = 1;
            double dailyIncome = weeklyIncome / 7;
            double dailyIncomeStore = dailyIncome;
            System.out.println("Your daily income is: " + String.format("%.2f", dailyIncome));
            while (dailyIncome < amount) {
                dailyIncome = dailyIncomeStore + dailyIncome;
                dayz++;
            }
            double weeks = dayz / 7;
            double months = weeks / 4;
            System.out.println("It will take you " + dayz + " days to make up the money,");
            if (weeks > 1) {
                System.out.println("That is " + String.format("%.2f", weeks) + " weeks,");
            } else {
                System.out.println("That is " + String.format("%.2f", weeks) + " week,");
            }
            System.out.println("or " + String.format("%.2f", months) + " months.");
        } else {
            System.out.println("With no income you cant make that money back");
        }
    }
}
