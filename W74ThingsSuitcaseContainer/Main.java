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
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        Things book = new Things("Happiness in Three Steps", 1);
        Things mobile = new Things("Nokia 3210", 5);
        Things brick = new Things("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Things heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);

        Things book = new Things("Happiness in Three Steps", 2);
        Things mobile = new Things("Nokia 3210", 1);
        Things brick = new Things("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        //System.out.println(container);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();*/
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);


    }

    public static void addSuitcasesFullOfBricks(Container container){
        
        for(int i = 0; i < 100; i++){
            Things bricks = new Things("Bricks", 1 + i);
            Suitcase suitcase = new Suitcase(100); 
            suitcase.addThing(bricks);
            container.addSuitcase(suitcase);
        }
    }
}