package choi.composite.domain;

import java.util.List;

/**
 * 현재 DeviceGroupV1은 기기들의 그룹 역할 객체.
 */
public class DeviceGroupV1 {

    private final List<Device> devices = List.of(new Aircon(), new Elevator(), new Light());

    public void turnAllOn() {
        devices.forEach(Device::turnOn);
    }

    public void turnAllOff() {
        devices.forEach(Device::turnOff);
    }
}
