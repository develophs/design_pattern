package choi.proxy.domain;

public class ProxyImage implements Image {

    private RealImage image;

    @Override
    public void draw() {
        if (image == null) {
            image = new RealImage();
        }
        image.draw();
    }
}
