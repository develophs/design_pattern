package choi.nullobject.discount;

public class SpecialDiscount {

    public int discount(int price) {
        return Math.max(price - 1000, 0);
    }
}
