package choi.strategy.domain;

import java.util.List;

public class CalculatorV1 {

    public double calculate(boolean firstGuest, boolean isFresh, List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            int price = item.getPrice();

            if (firstGuest) {
                sum += price * 0.9; //첫 손님 할인
            } else if (!isFresh) {
                sum += price * 0.8; // 덜신선한 아이템 세일
            } else {
                sum += price;
            }
        }

        return sum;
    }
}
