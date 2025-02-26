package lab2;

public class CustomerMainApp {
    public static void main(String[] args) {
        Customer customer1=new Customer("Bulmeseyo", "Gideon", "123456789");
        Customer customer2=new Customer("Kizza", "Naome", "123456789");
        Customer customer3=new Customer("FNU", "Dahlia", "123456789");
        Address address1 = new Address("St 1","Chicago","Iowa","52557");
        Address address2 = new Address("St 2","Fairfield","Iowa","52556");
        Address address3 = new Address("Tampines St 86","Singapore","Singapore","528588");
        customer1.setBillingAddress(address1);
        customer2.setBillingAddress(address2);
        customer3.setBillingAddress(address3);
        Address shippingAddress1 = new Address("St 1","Fairfield","Iowa","52557");
        Address shippingAddress2 = new Address("St 2","Chicago","Iowa","52556");
        Address shippingAddress3 = new Address("St 3","Fairfield","Iowa","52557");
        customer1.setShippingAddress(shippingAddress1);
        customer2.setShippingAddress(shippingAddress2);
        customer3.setShippingAddress(shippingAddress3);
        Customer[] customers = {customer1,customer2,customer3};
        for(Customer c : customers){

        }

    }
}
