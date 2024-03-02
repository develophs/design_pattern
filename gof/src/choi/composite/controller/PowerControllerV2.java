package choi.composite.controller;

import choi.composite.domain.*;

/**
 *  클라이언트는 기기들이 그룹인지, 개별인지 관심이없다.
 *  컴포지트에게 실행을 시키고, 컴포지트는 컴포넌트들에게 책임을 위임한다.
 *  컴포넌트들의 구성을 변경하려면 컴포지트 클래스에서 컴포넌트들을 관리하고,
 *  각 컴포넌트들의 기능을 다르게 하기 위해서는 각 컴포넌트들의 기능을 변경하면 된다.
 */
public class PowerControllerV2 {

    public void turnOn(final Long deviceId) {
        final Device device = findById(deviceId);
        device.turnOn();
    }

    public void turnOff(final Long deviceId) {
        final Device device = findById(deviceId);
        device.turnOff();
    }

    private Device findById(final Long deviceId) {
        // 예제 단순화 하기
        DeviceGroupV2 deviceGroupV2 = new DeviceGroupV2();
        deviceGroupV2.addComponent(new Aircon());
        deviceGroupV2.addComponent(new Light());
        deviceGroupV2.addComponent(new Elevator());

        return deviceGroupV2;
    }




}
