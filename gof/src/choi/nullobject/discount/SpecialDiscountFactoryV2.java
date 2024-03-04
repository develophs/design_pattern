package choi.nullobject.discount;

import choi.nullobject.customer.Customer;

public class SpecialDiscountFactoryV2 {

    public SpecialDiscount create(Customer customer) {
        if (checkNewCustomer(customer)) {
            return new SpecialDiscount();
        }
        return new DefaultSpecialDiscount();
    }

    private boolean checkNewCustomer(Customer customer) {
        return customer.isNewCustomer();
    }
}
