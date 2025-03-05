package lab4.bonus2;

class CreditCardPayment implements QuickPayInterface {
    private final String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String getPaymentDetails() {
        return cardNumber.replaceAll("\\d(?=\\d{4})", "*");
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card (Card Number: " + getPaymentDetails() + ")");
    }
}
