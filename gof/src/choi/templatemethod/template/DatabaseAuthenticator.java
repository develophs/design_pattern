package choi.templatemethod.template;

public class DatabaseAuthenticator extends Authenticator{

    @Override
    protected boolean doAuthenticate(String id, String password) {
        //return authRepository.authenticate(id, password);
        return true;
    }

    @Override
    protected boolean createAuth(String id) {
        // DatabaseContext ctx =  authRepository.find(id);
        return true;
    }
}
