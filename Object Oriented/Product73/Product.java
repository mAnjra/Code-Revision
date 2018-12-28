/**
 * This class represents a product in a 
 * shop - it has a price, Qty, & name 
 */
public class Product{

    private String name;
    private double price;
    private int qty;

    public Product(String name, double price, int qty){
        this.name  = name;
        this.price = price;
        this.qty   = qty;
    }

    public void printProduct(){
        System.out.println(this.name+", Price: "+this.price+", Quantity: "+this.qty);
    }
}