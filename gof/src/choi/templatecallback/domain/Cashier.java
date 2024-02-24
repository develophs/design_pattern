package choi.templatecallback.domain;

import choi.templatecallback.coupon.Coupon;

import java.util.List;

public class Cashier {

    // Coupon 객체(추상화에 사용할 객체)는 생성자 또는 메서드의 파라미터로 받는다.
    public double calculate(Coupon coupon, List<Product> products) {
        double totalPrice = products.stream().mapToDouble(Product::getTotalPrice).sum();
        
        //메서드 분리 가능
        return coupon.discount(totalPrice);
    }
}
