package choi.composite;

import choi.composite.controller.PowerControllerV1;

public class CompositeMainV1 {

    public static void main(String[] args) {
        final PowerControllerV1 powerControllerV1 = new PowerControllerV1();

        powerControllerV1.turnOn(0L);
        System.out.println("================");
        powerControllerV1.turnGroupOn(0L);
        System.out.println("================");
    }

}
