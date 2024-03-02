package choi.composite.domain;

public class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("light on");
    }

    @Override
    public void turnOff() {
        System.out.println("light off");
    }

}
