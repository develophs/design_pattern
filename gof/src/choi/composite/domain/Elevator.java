package choi.composite.domain;

public class Elevator implements Device {

    @Override
    public void turnOn() {
        System.out.println("elevator on");
    }

    @Override
    public void turnOff() {
        System.out.println("elevator off");
    }

}
