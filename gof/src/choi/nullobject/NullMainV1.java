package choi.nullobject;

import choi.nullobject.customer.Customer;
import choi.nullobject.discount.SpecialDiscount;
import choi.nullobject.discount.SpecialDiscountFactoryV1;

public class NullMainV1 {

    public static void main(String[] args) {
        final int price = 100;
        Customer customer = new Customer(false);
        SpecialDiscountFactoryV1 factory = new SpecialDiscountFactoryV1();
        SpecialDiscount specialDiscount = factory.create(customer);

        // 신규회원이 아닌경우 null을 리턴하기 때문에 NullPointerException가 발생한다.
        // int totalPrice = specialDiscount.discount(price);

        /**
         * NullPointerException을 피하기위해 null을 리턴할 가능성이 있을경우
         * 계속해서 null 체크 로직이 필요하다.
         */
        if (specialDiscount != null) {
            int totalPrice = specialDiscount.discount(price);
            System.out.println("totalPrice = " + totalPrice);
        }

    }
}
