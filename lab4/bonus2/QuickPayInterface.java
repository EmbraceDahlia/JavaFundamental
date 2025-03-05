package lab4.bonus2;

// Strategy Interface
interface QuickPayInterface {
    void pay(int amount);
    default String getPaymentDetails(){
        return  "";
    }
}
