package choi.observer.subject;

import choi.observer.status.Status;

public class StatusChecker extends StatusSubject{

    public void check() {
        Status status = loadStatus();

        if (!status.isNormal()) {
            super.notifyStatus(status);
        }
    }

    private Status loadStatus() {
        return new Status(false, 400);
    }
}
