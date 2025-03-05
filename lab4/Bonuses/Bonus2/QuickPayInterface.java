package lab4.Bonuses.Bonus2;

// Strategy Interface
interface QuickPayInterface {
    void pay(int amount);
    default String getPaymentDetails(){
        return  "";
    }
}
