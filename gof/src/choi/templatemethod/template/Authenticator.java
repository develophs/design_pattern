package choi.templatemethod.template;

import choi.templatemethod.exception.AuthException;

/**
 * 템플릿 메서드 패턴:
 * 동일한 구조, 구현 과정은 거의 유사하거나 비슷하다.
 * 구현 과정 중 일부가 다를경우 다른 부분을 구현하기 위해 추상메서드 및 상속을 이용한다.
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
