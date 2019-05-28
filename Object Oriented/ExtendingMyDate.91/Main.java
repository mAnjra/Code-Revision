public class Main {
    public static void main(String[] args) {
        /*
         * TEST PART 1,2 MyDate date = new MyDate(29, 1, 2019); date.advance();
         * System.out.println(date.toString()); date.advance(5);
         * System.out.println(date.toString());
         */
        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));
    }

}
