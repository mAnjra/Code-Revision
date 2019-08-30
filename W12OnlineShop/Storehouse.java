package OnlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse(){
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.products.put(product.trim().toLowerCase(), price);
        this.stocks.put(product.trim().toLowerCase(),stock);
    }

    public int stock(String product){
        if(this.stocks.containsKey(product)){
            return this.stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product){
        // decrease stock
        if(this.stocks.containsKey(product) && this.stocks.get(product)>0) {
            int i = this.stocks.get(product);
            this.stocks.put(product, i-1);
            return true;
        }else {
            return  false;
            }
    }

    public void printAllStock(){
       this.stocks.entrySet().forEach(p-> System.out.println(p.getKey()+" "+ p.getValue()));
    }


    public Set<String> products(){
        return this.stocks.keySet();
    }

    public int price(String product){
        if(this.products.containsKey(product)){
            return this.products.get(product);
        }
        return -99;
    }

}
