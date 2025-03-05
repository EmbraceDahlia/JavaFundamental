package lab4.problem1;

public class Clothing extends Product {
    private String brand;
    private double percentageDiscount;

    Clothing(String productName, double price, String brand, double percentageDiscount){
        super(productName, price);
        this.brand = brand;
        this.percentageDiscount = percentageDiscount;

    }

    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice() * percentageDiscount/100);
    }

    @Override
    public String toString() {
        return super.toString() +", Brand: " + brand + ", Discount: " + percentageDiscount + "%, Final Price: " + getPrice();
    }
}
