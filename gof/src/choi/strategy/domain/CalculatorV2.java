package choi.strategy.domain;

import choi.strategy.discountpolicy.DiscountPolicy;

import java.util.List;

public class CalculatorV2 {

    private final DiscountPolicy discountPolicy;

    public CalculatorV2(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculate(List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            sum += discountPolicy.getDiscountPrice(item);
        }

        return sum;
    }
}
