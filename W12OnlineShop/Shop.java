package OnlineShop;

import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("Here is what we have in stock:");

        for (String product : store.products()) {
            String listCapital = product.substring(0,1).toUpperCase() + product.substring(1).toLowerCase();
            System.out.println(listCapital +": Price("+ this.store.price(product)+") Stock("+this.store.stock(product)+")");
        }

        while (true) {
            System.out.print("What do you want to buy? (press enter to pay):");
            String product = reader.nextLine().trim().toLowerCase();
            if (product.isEmpty()) {
                break;
            } else if(this.store.take(product)){
                basket.add(product, this.store.price(product));
                String temp = product.substring(0,1).toUpperCase() + product.substring(1).toLowerCase();
                System.out.println(temp +": "+this.store.stock(product)+" left");
                }else {
                System.out.println("This item does not exist");
            }
        }

        System.out.println("Your purchases are:");
        basket.print();
        System.out.println("Basket price: " + basket.price());
        System.out.println("Printing remaining stock after transaction:");
        store.printAllStock();
    }

}
