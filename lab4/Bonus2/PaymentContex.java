package lab4.Bonus2;

class PaymentContext {
    private QuickPayInterface paymentOption;

    public void setPaymentOption(QuickPayInterface paymentOption) {
        this.paymentOption = paymentOption;
    }

    public void executePayment(int amount) {
        if (paymentOption == null) {
            System.out.println("No payment option selected!");
        } else {
            paymentOption.pay(amount);
        }
    }
}