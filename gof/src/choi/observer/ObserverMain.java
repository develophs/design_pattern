package choi.observer;

import choi.observer.observer.EmailStatusObserver;
import choi.observer.observer.PushStatusObserver;
import choi.observer.observer.SmsStatusObserver;
import choi.observer.observer.StatusObserver;
import choi.observer.subject.StatusChecker;

/**
 * 옵저버 패턴:
 * 한 객체의 상태 변화를 정해지지 않은 여러 다른 객체에게
 * 통지하고 싶을 때 사용되는 패턴
 *
 * Subject는 옵저버를 관리하고,
 * 행동을 옵저버에게 위임.
 * 상태 확인 객체는 따로 둔다.
 *
 * 주제 클래스(Subject) 변경 없이 옵저버를 관리할 수 있다.
 */
public class ObserverMain {

    public static void main(String[] args) {
        StatusChecker checker = new StatusChecker();
        StatusObserver smsObserver = new SmsStatusObserver();
        StatusObserver pushObserver = new PushStatusObserver();
        EmailStatusObserver emailStatusObserver = new EmailStatusObserver();

        checker.addObserver(smsObserver);
        checker.addObserver(pushObserver);
        checker.addObserver(emailStatusObserver);

        checker.check();
    }
}
