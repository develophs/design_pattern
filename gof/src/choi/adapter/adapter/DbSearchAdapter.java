package choi.adapter.adapter;

import choi.adapter.service.port.SearchPort;

public class DbSearchAdapter implements SearchPort {

    @Override
    public String search(final String keyword) {
        // DB를 이용하더라도, Service 클래스의 코드는 변하지 않는다.
        // 서비스 클래스에게 응답할 응답값만을 조절, 변경하여 응답해주면 된다.
        return "DB :: " + keyword;
    }
}
