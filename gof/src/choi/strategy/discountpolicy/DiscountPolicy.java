package choi.strategy.discountpolicy;

import choi.strategy.domain.Item;

public interface DiscountPolicy {

    double getDiscountPrice(Item item);
}
