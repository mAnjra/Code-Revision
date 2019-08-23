package BoxesAndThings;

public class Main {
    public static void main(String[] args) {
/*
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

*/
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( "Printing Box 1 :\n"+box );

        // Storing boxes within boxes
        Box box2 = new Box(11);
        Box box3 = new Box(11);
        // add box 1 & 2 to 3
        box3.add(box);
        box3.add(box2);

        // add item to box box 2
        System.out.println("Book added to Box 2!");
        box2.add(new Book("Sleep","Fish",5 ));
        // print box 3
        System.out.println( "Printing Box 3 with box 1 and 2 inside: \n"+box3);

        // store box 3 within box 3?
        System.out.println("Trying to add Box 3 to Box 3... ");
        box3.add(box3);
        System.out.println(box3);

        // stack overflow error - bad recursive call - ends up calling itself forever until stack over flows
        // line 29 - t.weight will keep calling weight() which contains t.weight which will call weight()....
        System.out.println("Creating a new Box 4...");
        Box box4 = new Box(21);
        box4.add(box4);
        System.out.println(box4);
    }
}
