package choi.nullobject;

import choi.nullobject.customer.Customer;
import choi.nullobject.discount.SpecialDiscount;
import choi.nullobject.discount.SpecialDiscountFactoryV2;

public class NullMainV2 {

    public static void main(String[] args) {
        final int price = 100;
        Customer customer = new Customer(false);
        SpecialDiscountFactoryV2 factory = new SpecialDiscountFactoryV2();
        SpecialDiscount specialDiscount = factory.create(customer);

        int totalPrice = specialDiscount.discount(price);
        System.out.println("totalPrice = " + totalPrice);
    }
}
