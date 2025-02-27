package lab2.problem1;

public final class Customer {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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



