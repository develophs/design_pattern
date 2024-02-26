package choi.observer.subject;

import choi.observer.observer.StatusObserver;
import choi.observer.status.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject 클래스는 옵저버 관리 책임을 가진다.
 * 옵저버 추가, 삭제 및 관리.
 * 옵저버에게 책임을 위임한다.
 */
public abstract class StatusSubject {

    private List<StatusObserver> observers = new ArrayList<>();

    public void addObserver(StatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StatusObserver observer) {
        observers.remove(observer);
    }

    protected void notifyStatus(Status status) {
        for (StatusObserver observer : observers) {
            observer.send(status);
        }
    }

}
