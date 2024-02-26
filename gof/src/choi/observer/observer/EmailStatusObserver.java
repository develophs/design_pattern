package choi.observer.observer;

import choi.observer.status.Status;

public class EmailStatusObserver implements StatusObserver {
    @Override
    public void send(Status status) {
        sendEmail(status);
    }

    private void sendEmail(Status status) {
        System.out.println("이메일을 이용하여 상태를 보냅니다.");
    }
}
