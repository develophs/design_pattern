package choi.composite.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * ★신기한점 :: 기기들을 관리하는 그룹 객체가, 기기타입으로 구현된다.
 *
 * 컴포지트 패턴 적용
 * 컴포지트는 컴포넌트들을 관리하고,
 * 컴포넌트에게 책임을 위임한다.
 */
public class DeviceGroupV2 implements Device{

    private List<Device> devices = new ArrayList<>();

    public void addComponent(Device device) {
        devices.add(device);
    }

    public void removeComponent(Device device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        devices.forEach(Device::turnOn);
    }

    @Override
    public void turnOff() {
        devices.forEach(Device::turnOff);
    }
}
