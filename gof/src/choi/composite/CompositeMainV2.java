package choi.composite;

import choi.composite.controller.PowerControllerV2;

public class CompositeMainV2 {

    public static void main(String[] args) {
        final PowerControllerV2 controller = new PowerControllerV2();

        controller.turnOn(0L);
        System.out.println("===========");
        controller.turnOff(0L);
    }

}
