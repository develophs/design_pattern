package choi.nullobject.customer;

public class Customer {

    private boolean newCustomer;

    public Customer(boolean newCustomer) {
        this.newCustomer = newCustomer;
    }

    public boolean isNewCustomer() {
        return newCustomer;
    }
}
