package choi.proxy;

import choi.proxy.domain.Client;
import choi.proxy.domain.ProxyImage;

/**
 * 프록시 패턴은 데코레이터 패턴과 유사하다.
 * 의도를 명확히 해야한다.
 *
 * 프록시 패턴은 주로 접근제어를위해 적용하며,
 * 데코레이터 패턴은 기능을 확장하기 위해 적용한다.
 */
public class ProxyMain {

    public static void main(String[] args) {
        // Image의 DI를 ProxyImage로 해준다.
        // 프록시 클래스에서 실제 구현 클래스를 호출한다.
        final Client client = new Client(new ProxyImage());
        client.write();
    }
}
