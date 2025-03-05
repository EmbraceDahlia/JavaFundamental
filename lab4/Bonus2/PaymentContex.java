package lab4.Bonus2;
import java.util.Scanner;

class PaymentContext {
    private QuickPay paymentOption;
    
    public void setPaymentOption(QuickPay paymentOption) {
        this.paymentOption = paymentOption;
    }
    
    public void executePayment(int amount) {
        if (paymentOption == null) {
            System.out.println("No payment option selected!");
        } else {
            paymentOption.pay(amount);
        }
    }


    private static PaymentContext getPaymentContext(Scanner sc, int userOption) {
    PaymentContext context = new PaymentContext();
    System.out.println("Enter details:");
    String paymentDetails = sc.nextLine();

    switch (userOption) {
        case 1 -> context.setPaymentOption(new CreditCardPayment(paymentDetails));
        case 2 -> context.setPaymentOption(new PayPalPayment(paymentDetails));
        case 3 -> context.setPaymentOption(new MobileMoney(paymentDetails));
    }
    return context;
}

}
