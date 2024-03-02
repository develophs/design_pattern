package choi.composite.domain;

public class Aircon implements Device {

    @Override
    public void turnOn() {
        System.out.println("aircon on");
    }

    @Override
    public void turnOff() {
        System.out.println("aircon off");
    }
}
