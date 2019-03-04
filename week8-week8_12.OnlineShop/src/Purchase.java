import java.util.*;

public class Purchase {
    
    private String product;
    private int amount;
    private int unitPrice;
    
    // CONSTRUCTOR
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    // CONSTRUCTOR
    public Purchase(String product, int unitPrice) {
        this(product,1,unitPrice);
    }
    
    // METHOD. Returns the purchase price
    public int price() {
        return (this.amount * this.unitPrice);
    }
    
    // METHOD. increases purchase unit amount by one
    public void increaseAmount() {
        this.amount++;
    }
    
    public String toString() {
        return this.product + ": " + this.amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.product != null ? this.product.hashCode() : 0);
        hash = 79 * hash + this.unitPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if ((this.product == null) ? (other.product != null) : !this.product.equals(other.product)) {
            return false;
        }
        return true;
    }
    
    
    
}
