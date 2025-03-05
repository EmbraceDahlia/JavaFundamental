package lab4.Bonus2;
class PayPalPayment implements QuickPay {
    private String email;
    
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal Email: " + email + "");
    }
}