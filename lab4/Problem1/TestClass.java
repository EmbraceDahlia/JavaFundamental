package lab4.Problem1;

public class TestClass {
    public static void main(String[] args){
        Product[] products = new Product[5];
        products[0] = new Clothing("T-Shirt",20.0,"Nike", 10);
        products[1] = new Furniture("Chair",80.0,"Leather", 20);
        products[2] = new Electronics("Monitor", 500.0, 12, 40.0);
        products[3] = new Clothing("Dress", 40.0, "Lv", 15);
        products[4] = new Furniture("Sofa", 500.0, "Leather", 40.0);


        for(Product p: products){
            System.out.println(p);
        }

        double totalSum = sumProducts(products);
        System.out.println("Total Price of All Products: " + totalSum);

    }

    public static double sumProducts(Product[] col) {
        double sum = 0;
        if (col != null) {
            for (Product p : col) {
                if (p != null) {
                    sum += p.getPrice();
                }
            }
        }
        return sum;
    }
}
