package lab2;

public final class Customer {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String fName, String lName, String ssn){
        this.firstName = fName;
        this.lastName = lName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString(){
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socialSecurityNumber + "]";
    }

}



