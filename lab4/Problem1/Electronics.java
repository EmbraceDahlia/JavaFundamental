package lab4.Problem1;

public class Electronics extends Product {
   private int warranty;
   private double warrantyCost;

    public Electronics(String productName, double productPrice, int warranty, double warrantyCost) {
        super(productName,productPrice);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }

    // @Override
    public String toStrings() {
        return super.toString() + ", Warranty: " + warranty + " months, Warranty Cost: " + warrantyCost + ", Final Price: " + getPrice();

    }
}