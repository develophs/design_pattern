package choi.templatemethod.template;

import choi.templatemethod.exception.AuthException;

/**
 * 템플릿 메서드 패턴:
 * 동일한 구조, 구현 과정은 거의 유사하거나 비슷하다.
 * 구현 과정 중 일부가 다를경우 다른 부분을 구현하기 위해 추상메서드 및 상속을 이용한다.
 *
 * 일반적인 상속 구조라면 자손 클래스가 부모 클래스의 메서드를 오버라이딩할지 안할지 결정해 주도권이 자손클래스에 있지만,
 * 템플릿 메서드 패턴은 흐름 제어의 주도권이 부모 클래스에있다.
 * why) 구현된 메서드에서 추상 메서드를 실행시키도록 부모 클래스에서 구현한다.
 */
public abstract class Authenticator {

    // 단순하게 하기위해 리턴 boolean
    public boolean authenticate(String id, String password) {
        if (!doAuthenticate(id, password)) {
            createException();
        }
        return createAuth(id);
    }

    protected abstract boolean doAuthenticate(String id, String password);

    protected abstract boolean createAuth(String id);

    private RuntimeException createException() {
        throw new AuthException("인증 실패");
    }

}
