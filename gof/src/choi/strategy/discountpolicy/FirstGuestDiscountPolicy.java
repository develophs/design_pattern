package choi.strategy.discountpolicy;

import choi.strategy.domain.Item;

public class FirstGuestDiscountPolicy implements DiscountPolicy{

    @Override
    public double getDiscountPrice(Item item) {
        return item.getPrice() * 0.9;
    }
}
