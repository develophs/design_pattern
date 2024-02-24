package choi.templatecallback.domain;

public class Product {

    private final int price;
    private final int quantity;

    public Product(final int price, final int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

}
