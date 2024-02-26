package choi.observer.observer;

import choi.observer.status.Status;

public class SmsStatusObserver implements StatusObserver {

    @Override
    public void send(Status status) {
        sendSms(status);
    }

    private void sendSms(Status status) {
        System.out.println("문자를 이용하여 상태를 보냅니다.");
    }

}
