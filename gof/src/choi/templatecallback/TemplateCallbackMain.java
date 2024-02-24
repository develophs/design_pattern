package choi.templatecallback;

import choi.templatecallback.domain.Cashier;
import choi.templatecallback.domain.Product;

import java.util.List;

/**
 * 템플릿 콜백 패턴 : 스프링 프레임워크에서 사용한 디자인 패턴, 전략패턴과 템플릿 메서드의 조합
 * ~~Template
 * 템플릿 메서드와 비교하여 상속을 사용하지 않기 때문에 클래스가 갯수가 너무 많아지는것을 방지하고,
 * 컴파일 시점 외 런타임 시점에서도 구현을 변경할 수 있다. 상속에비해 유연한 구조를 가진다.
 */
public class TemplateCallbackMain {

    public static void main(String[] args) {
        // 상품 총액 = 5000
        final Cashier cashier = new Cashier();
        final Product product1 = new Product(1000, 1);
        final Product product2 = new Product(2000, 2);

        // 총 가격의 10%를 할인해준다.
        double total = cashier.calculate((totalPrice) -> totalPrice * 0.9, List.of(product1, product2));

        // ex) 런타임 중 구현 변경 >> 50프로 할인
        // total = cashier.calculate((totalPrice) -> totalPrice * 0.5, List.of(product1, product2));

        System.out.println("total = " + total);
    }
}
