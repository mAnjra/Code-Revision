import java.util.ArrayList;

public class Library {

    ArrayList<Book> libArray = new ArrayList<Book>();

    public Library() {
    }

    public void addBook(Book newBook) {
        libArray.add(newBook);
    }

    public void printBook() {
        for (Book s : libArray) {
            System.out.println(s);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        int j = 0;
        for (int i = 0; i < libArray.size(); i++) {
            j++;
            if (StringUtils.included(libArray.get(i).title, title)) { // The '.' before title allows access to the classes methods constructor, in this case it is the field title
                found.add(libArray.get(i));
            }
        }
        System.out.println(j);
        return found;
        
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<>();
        for(int i = 0; i < libArray.size(); i++){
            if(StringUtils.included(libArray.get(i).publisher, publisher)){
                found.add(libArray.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(int i = 0; i < libArray.size(); i++){
            if(libArray.get(i).year == year){
                found.add(libArray.get(i));
            }
        }
        return found;
    }
}