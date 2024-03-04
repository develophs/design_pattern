package choi.nullobject.discount;

import choi.nullobject.customer.Customer;

/**
 * 신규 고객이 아닌경우 할인정책이 존재하지 않아 null을 리턴한다.
 */
public class SpecialDiscountFactoryV1 {

    public SpecialDiscount create(Customer customer) {
        if (checkNewCustomer(customer)) {
            return new SpecialDiscount();
        }
        return null;
    }

    private boolean checkNewCustomer(Customer customer) {
        return customer.isNewCustomer();
    }
}
