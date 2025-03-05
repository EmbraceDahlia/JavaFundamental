package lab4.Bonus2;

class MobileMoney implements QuickPayInterface {
    private final String mobileNumber;
    
    public MobileMoney(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using MobileMoney (Number: " + mobileNumber + ")");
    }


}