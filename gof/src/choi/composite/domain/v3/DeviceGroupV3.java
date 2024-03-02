package choi.composite.domain.v3;

import choi.composite.domain.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * V2는 컴포넌트 관리 책임을 DeviceGroup에게 맡겼지만,
 * V3는 컴포넌트 관리 책임을 Device에게 맡겼다.
 */
public class DeviceGroupV3 extends DeviceV3 {

    @Override
    public void addComponent(final Device device) {
        devices.add(device);
    }

    @Override
    public void removeComponent(final Device device) {
        devices.remove(device);
    }

    /**
     * 해당 타입일때만 컴포넌트들을 관리할 권한을 준다.
     */
    @Override
    public boolean canContains() {
        return true;
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
