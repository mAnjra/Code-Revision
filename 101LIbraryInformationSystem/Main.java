import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
         * Library Library = new Library();
         * 
         * Book cheese = new Book("Cheese problems solved", "Woodhead publishing",
         * 2007); Library.addBook(cheese);
         * 
         * Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
         * Library.addBook(nhl);
         * 
         * Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
         * 
         * Library.printBook();
         */
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp Cheese", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));


        
        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }
        /*
        System.out.println("---");
        for(Book book : Library.searchByPublisher("Penguin Group")){
            System.out.println(book);
        }*/
    }
}