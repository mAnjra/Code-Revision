public class Book{
    String title;
    String publishers;
    int year;

    public Book(String title, String publisher, int year){
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int getYear(){
        return this.year;
    }

    public String toString(){
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}