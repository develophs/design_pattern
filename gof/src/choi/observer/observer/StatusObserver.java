package choi.observer.observer;

import choi.observer.status.Status;

public interface StatusObserver {
    void send(Status status);
}
