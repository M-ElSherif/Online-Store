
import java.util.*;

public class ShoppingBasket {

    private List<Purchase> purchases;

    // CONSTRUCTOR
    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    // METHOD. Adds a purchase to the shopping basket. 
    public void add(String product, int price) {

        // if basket contains the product, increase aount by 1
        for (Purchase purchase : this.purchases) {
            if (purchase.equals(new Purchase(product,price))) {
                purchase.increaseAmount();
            }
        }
        // else if 
        if (!this.purchases.contains(new Purchase(product, price))) {
            this.purchases.add(new Purchase(product,price));
        }
    }

    // METHOD. returns the shopping basket total price
    public int price() {
        int totalPrice = 0;

        for (Purchase purchase : this.purchases) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    // METHOD. Prints the purchase objects in out shopping basket
    public void print() {
        for (Purchase purchase : this.purchases) {
            System.out.println(purchase.toString());
        }
    }
}
