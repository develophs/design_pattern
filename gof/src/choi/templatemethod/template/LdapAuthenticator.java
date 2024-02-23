package choi.templatemethod.template;

/**
 * 상위 클래스의 구현된 메서드는그대로 사용하고,
 * 추상 메서드를 구현한다.
 */
public class LdapAuthenticator extends Authenticator{
    @Override
    protected boolean doAuthenticate(String id, String password) {
        // return ldapClient.authenticate(id, password);
        return true;
    }

    @Override
    protected boolean createAuth(String id) {
        // LdapContext ctx =  ldapClient.find(id);
        return false;
    }
}
