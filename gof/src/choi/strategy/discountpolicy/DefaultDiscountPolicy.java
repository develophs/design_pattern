package choi.strategy.discountpolicy;

import choi.strategy.domain.Item;

/**
 * 할인정책이 정해지지 않은경우 아이템의 정가 리턴
 */
public class DefaultDiscountPolicy implements DiscountPolicy{

    @Override
    public double getDiscountPrice(Item item) {
        return item.getPrice();
    }
}
