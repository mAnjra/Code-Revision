package HashcodeEqualsOverride;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> loaners = new HashMap<Book, String>();

        // HASHCODE(DEFAULT) IMPLEMENTATION
        Book objectBook = new Book("Objectbook", 2000); // a book created
        loaners.put(objectBook, "Pekka"); // who has taken the book - added to hashmap
        loaners.put(new Book("Test Driven Development", 1999), "Senna"); // alternate way - adding to hash map and creating book same line
        // new book object created however it has the same CONTENT as objectBook - with the default
        // implementation of the hashcode method and equals methods we cannot tell whether two different objects with the same content are in the hashmap as they are given two different
        // hashcodes. So far ive used Strings as keys, String class overrides the hashcode method. However its implementation does not take into consideration nullpointer exception.
        // The custom implementation of the hashcode must give the same numeric value to all objects that hold the same value which is why we need the equals method alongside
        // chances are the same numeric value can be given to objects that dont have the same content, but that should be as rare as possible.
        // we can delegate to the Strings hashcode method. --> look in class | Book

        // hashcode is created using key, an index is allocated using the hashcode, this is then placed into a bucket as a linked list
        // so when you search for the item using the key instead of doing a linear search we simply lookup the hashcode which gives us the
        // index and we find our value. however if a hashcode collision occurs - same hashcode created for two unequal objects - when we look to
        // retrieve the value using the key-hashcode-index we will get a linked list within the index/bucket, and a linear search will take place
        // the linked list stores 4 items (for example in a box), 1.hashcode 2.key 3.value 4.next box in the linked list. if the bucket has more than
        // one item it will first look to see if its the right hashcode then call the equals method to see if its the right value - thats why custom
        // implementation of equals method is important - when adding we use hashcode to find right bucket and equals method to see if the bucket already contains
        // the item you're trying to add.

        // hashcode's need to be as unique as possible - so when you create a hashmap each bucket should have a list size of 1 for quick retrieval.


        System.out.println(loaners.get(objectBook)); // output: Pekka.
        System.out.println( loaners.get( new Book("Objectbook", 2000) ));
        System.out.println( loaners.get( new Book("Test Driven Development", 1999) ));

    }
}
