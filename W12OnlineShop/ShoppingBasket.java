package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> shoppingBasket;

    public ShoppingBasket(){
        this.shoppingBasket = new HashMap<String, Purchase>();
    }

    public  void add(String product, int price){
        if(this.shoppingBasket.containsKey(product)){
            Purchase p = this.shoppingBasket.get(product);
            p.increaseAmount();
            return;
        }
        Purchase purchase = new Purchase(product, 1,price);
        this.shoppingBasket.put(product, purchase);
    }

    public int price(){
        int total = 0;
        for(Purchase i : this.shoppingBasket.values()){
            total += i.price();
        }
        return total;
    }

    public void print(){
        this.shoppingBasket.entrySet().forEach(p-> System.out.println(p.getValue().toString()));
    }



}
