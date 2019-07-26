public class Main{
    public static void main(String[] args){
        /*Things book = new Things("Rubicon", 2);
        System.out.println(book.toString());
        Things book = new Things("Happiness in Three Steps", 2);
        Things mobile = new Things("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
        Things book = new Things("Happiness in three steps", 2);
        Things mobile = new Things("Nokia 3210", 1);
        Things brick = new Things("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);*/

        /*
        Things book = new Things("Happiness in Three Steps", 2);
        Things mobile = new Things("Nokia 3210", 1);
        Things brick = new Things("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase.printThings();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");*/
        Things book = new Things("Happiness in Three Steps", 1);
        Things mobile = new Things("Nokia 3210", 5);
        Things brick = new Things("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Things heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
}