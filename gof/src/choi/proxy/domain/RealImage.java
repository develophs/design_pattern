package choi.proxy.domain;

public class RealImage implements Image {

    @Override
    public void draw() {
        System.out.println("이미지를 가져옵니다.");
    }
}
