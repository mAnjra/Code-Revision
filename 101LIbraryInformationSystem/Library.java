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

    public ArrayList<Book> searchByTitle(String titled) {
        ArrayList<Book> found = new ArrayList<Book>();
        int j = 0;
        for (int i = 0; i < libArray.size(); i++) {
            j++;
            if (libArray.get(i).title.contains(titled)) { //here title will only reference the title of the index that is returns, so in index i the 3 columns will be looked at and title will only be returned
                found.add(libArray.get(i));
            }
        }
        /*
         * for(String b : libArray){ if(b.contains(title)){ found.add(b); } }
         */
        System.out.println(j);
        return found;
        
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<>();
        for(int i = 0; i < libArray.size(); i++){
            if(libArray.get(i).publisher.contains(publisher)){
                found.add(libArray.get(i));
            }
        }
        return found;
    }

    /*public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<>();
        //for
    }*/
  
}