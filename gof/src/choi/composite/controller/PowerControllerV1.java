package choi.composite.controller;

import choi.composite.domain.Device;
import choi.composite.domain.DeviceGroupV1;
import choi.composite.domain.Light;

/**
 *  개별 디바이스, 그룹 디바이스 차이를 빼면 동일한 메서드 들이 중복해서 생성된다.
 *  전원 켜기, 전원 끄기 나중에 추가 기능이 필요할 경우 개별 기능1 그룹 기능1 중복해서 메서드가 생성된다.
 */
public class PowerControllerV1 {

    public void turnOn(final Long deviceId) {
        final Device device = findById(deviceId);
        device.turnOn();
    }

    private Device findById(final Long deviceId) {
        // 예제 단순화 하기
        return new Light();
    }

    public void turnGroupOn(final Long groupId) {
        final DeviceGroupV1 deviceGroupV1 = findGroupById(groupId);
        deviceGroupV1.turnAllOn();
    }

    private DeviceGroupV1 findGroupById(final Long groupId) {
        // 예제 단순화 하기
        return new DeviceGroupV1();
    }


}
