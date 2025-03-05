package lab4.Bonus2;

class CreditCardPayment implements QuickPay {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card (Card Number: " + cardNumber + ")");
    }
}
