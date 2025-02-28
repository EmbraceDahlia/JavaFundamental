package lab2.problem5;

enum PizzaSize {
    SMALL,
    MEDIUM,
    LARGE
}

enum PizzaType {
    VEGGIE,
    PEPPERONI,
    CHEESE,
    BBQ_CHICKEN
}

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double sizePrice = switch (pizzaSize) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
            default -> 5.00;
        };

        double typePrice = switch (pizzaType) {
            case VEGGIE -> 1;
            case PEPPERONI -> 2;
            case CHEESE -> 1.5;
            case BBQ_CHICKEN -> 2;
            default -> 1.00;
        };
        this.price = ((sizePrice + typePrice) * quantity);
    }

    private double calculateTax() {
        return 0.03 * this.price;
    }

    public String printOrderSummary() {
        this.calculatePrice();
        double tax = calculateTax();
        double totalPrice = tax + this.price;
        String orderSummary = "Pizza Order:\n" + //
                "Size: %s\n" + //
                "Type: %s\n" + //
                "Qty: %d\n" + //
                "Price: $%.2f\n" + //
                "Tax: $%.2f\n" + //
                "Total Price: $%.2f\n";
        return String.format(orderSummary, this.pizzaSize, this.pizzaType, this.quantity, this.price, tax,
                totalPrice);

    }
}
