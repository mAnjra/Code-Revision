package BoxesAndThings;

public class Book implements ToBeStored{
    private String writer;
    private String title;
    private double weight;

    public Book(String writer, String title, double weight){
        this.writer = writer;
        this.title = title;
        this.weight= weight;
    }

    @Override
    public String toString() {
        return  writer +": "+ title;
    }

    @Override
    public double weight() {
        return weight;
    }
}
