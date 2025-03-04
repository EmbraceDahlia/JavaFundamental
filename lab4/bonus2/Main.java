package lab4.bonus2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        System.out.println("Welcome to Quick pay:");
        System.out.println("Please select a payment option:");
        System.out.println("1 Card Payment");
        System.out.println("2 PayPal");
        System.out.println("3 Mobile Money");
        int userOption = sc.nextInt();
        sc.nextLine();
   
        PaymentContext context = new PaymentContext();
        String paymentDetails = "";

        switch(userOption){
            case 1:
            System.out.println("Please enter card number in the format (1234-5678-9876-5432)");
            paymentDetails = sc.nextLine();
            context.setPaymentOption(new CreditCardPayment(paymentDetails));
            break;

            case 2:
            System.out.println("Please enter your email");
            paymentDetails = sc.nextLine();
            context.setPaymentOption(new PayPalPayment(paymentDetails));
            break;

            case 3:
            System.out.println("Please enter Phone number i.e +1 621 707067954");
            paymentDetails = sc.nextLine();
            context.setPaymentOption(new MobileMoney(paymentDetails));
            break;

            default:
            System.out.println("Invalid Input");
            sc.close();
            return; 

        }

        
        System.out.println("Enter amount in USD:");
        int amount = sc.nextInt();
        sc.nextLine(); 
        
        context.executePayment(amount);
        sc.close();
       



        }

       
    }
