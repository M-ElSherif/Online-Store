
import java.util.*;

public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    //CONSTRUCTOR
    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    // METHOD. Adding to the storehouse a product whose price and number of stocks
    // are the parameter values
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }

    // METHOD. returns the price of the parameter product. If the product in not
    // available in the storehouse, the method returns -99
    public int price(String product) {
        if (!products.containsKey(product)) {
            return -99;
        }
        return this.products.get(product);
    }

    // METHOD. returns the stock of the parameter product. Of stock not available,
    // return 0
    public int stock(String product) {
        if (!stocks.containsKey(product)) {
            return 0;
        }
        return this.stocks.get(product);
    }

    // METHOD. decreases the stock of the parameter product by one and it returns true
    // if the object was avaialable in the storehouse. If the product was not i
    // the storehouse, the method returns false. Product stock cannot go below zero
    public boolean take(String product) {
            int quantity = this.stock(product);
            
            if (quantity >= 1) {
                quantity--;
                this.stocks.replace(product, quantity);
                return true;
            }
            
        return false;
    }

    // METHOD. Returns a name set of the products contained in the storehouse
    public Set<String> products() {
        Set<String> productList = this.products.keySet();

        return productList;
    }

}
