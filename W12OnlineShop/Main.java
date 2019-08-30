package OnlineShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Storehouse storehouse = new Storehouse();
        storehouse.addProduct("milk", 3, 10);
        storehouse.addProduct("coffee", 5, 7);

        System.out.println("Prices \n"+"milk: "+ storehouse.price("milk"));
        System.out.println("coffee: "+ storehouse.price("coffee"));
        System.out.println("sugar: " + storehouse.price("sugar"));

         */
        /*
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

         */
        /*
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        }

         */
        /*
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );

         */

        /*
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
        basket.print();

         */
        /*
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("...MILK ADDED!");
        basket.add("milk", 3);
        System.out.println("Printing basket: ");
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        System.out.println("...BUTTERMILK ADDED!");
        basket.add("buttermilk", 2);
        System.out.println("Printing basket: ");
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        System.out.println("...MILK ADDED!");
        basket.add("milk", 3);
        System.out.println("Printing basket: ");
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        System.out.println("...MILK ADDED!");
        basket.add("milk", 3);
        System.out.println("Printing basket: ");
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

         */
        Storehouse store = new Storehouse();
        store.addProduct("Coffee", 5, 10);
        store.addProduct("Milk", 3, 20);
        store.addProduct("Milk Butter", 2, 55);
        store.addProduct("Bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Jefferson SteelFlex");




    }
}