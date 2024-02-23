package choi.strategy;

import choi.strategy.discountpolicy.DefaultDiscountPolicy;
import choi.strategy.discountpolicy.DiscountPolicy;
import choi.strategy.discountpolicy.FirstGuestDiscountPolicy;
import choi.strategy.discountpolicy.NotFreshDiscountPolicy;
import choi.strategy.domain.CalculatorV2;
import choi.strategy.domain.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 전략패턴 : 비슷한 코드를 실행하는 if-else 블록은 전략 패턴 적용 대상이다.
 * 같은 수준의 알고리즘을 다른 방식으로 구현할 때
 * 알고리즘을 추상화하고 구체클래스에서 알고리즘을 구현한다.
 */
public class StrategyMain {

    private static DiscountPolicy discountPolicy = new DefaultDiscountPolicy();

    /**
     * 정책이 변경되면 Calculator에게 변경된 정책을가진 구체클래스를 DI 하면된다.
     */
    public static void main(String[] args) {
        // onFirstGuestClick();
        // onNotFreshClick();
        CalculatorV2 calculatorV2 = new CalculatorV2(discountPolicy);

        List<Item> items = new ArrayList<>();
        items.add(new Item(1000));
        items.add(new Item(2000));

        double calculate = calculatorV2.calculate(items);

        System.out.println("calculate = " + calculate);
    }

    private static void onFirstGuestClick() {
        discountPolicy = new FirstGuestDiscountPolicy();
    }

    private static void onNotFreshClick() {
        discountPolicy = new NotFreshDiscountPolicy();
    }


}
