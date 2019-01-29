public class NumStatMain {
    public static void main(String[] args){
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        /*
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println(" Amount: "+ stats.amountOfNumbersAdded());
        System.out.println("    Sum: "+ stats.sum());
        System.out.println("Average: "+ stats.average());
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Type Number:");

        while (true) {
            int i = Integer.parseInt(scan.nextLine());
            if (i == -1) {
                break;
            }
            stats.addNumber(i);
            if(i%2==0){
                even.addNumber(i);
            }
            if(i%2!=0){
                odd.addNumber(i);
            }
        }
        scan.close();
        System.out.println("Sum: " + stats.sum());
        System.out.println("Even: "+ even.sum());
        System.out.println("Odd: "+ odd.sum());
    }
}
