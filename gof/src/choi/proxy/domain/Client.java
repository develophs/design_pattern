package choi.proxy.domain;

// 클라이언트는 Image를 바라본다. >> 클라이언트는 Image의 실제 타입을 알 수 없다.
public class Client {
    private final Image image;

    public Client(final Image image) {
        this.image = image;
    }

    public void write() {
        image.draw();
    }
}
