package choi.composite.domain.v3;

import choi.composite.domain.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * 컴포넌트들의 관리 책임을 누구에게 할것인가.
 */
public abstract class DeviceV3 {

    protected List<Device> devices = new ArrayList<>();

    public void addComponent(Device device) {
        throw new IllegalStateException("컴포넌트를 관리할 수 없습니다.");
    }

    public void removeComponent(Device device) {
        throw new IllegalStateException("컴포넌트를 관리할 수 없습니다.");
    }

    public boolean canContains() {
        return false;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
