package choi.observer.observer;

import choi.observer.status.Status;

public class PushStatusObserver implements StatusObserver {

    // 옵저버마다 상세 기능 구현이 가능하다.
    // 502 에러가 아니면 이메일과 SMS로만 발송해주세요.
    @Override
    public void send(Status status) {
        if (status.getStatusCode() == 502) {
            sendPush(status);
        }
    }

    private void sendPush(Status status) {
        System.out.println("PUSH를 이용하여 상태를 보냅니다.");
    }

}
