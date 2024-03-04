package choi.nullobject.discount;

public class DefaultSpecialDiscount extends SpecialDiscount {

    public int discount(int price) {
        return price;
    }

}
