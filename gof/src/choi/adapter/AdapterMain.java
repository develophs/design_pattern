package choi.adapter;

import choi.adapter.adapter.DbSearchAdapter;
import choi.adapter.adapter.WebSearchAdapter;
import choi.adapter.controller.SearchController;
import choi.adapter.controller.port.SearchService;
import choi.adapter.service.SearchServiceImpl;
import choi.adapter.service.port.SearchAdapter;

/**
 * 클라이언트인 Service 클래스는 콘크리트 Adapter 클래스를 모른다.
 * 헥사고날 아키텍처의 port-adapter 패턴으로 구현해봤다.
 * 
 * 클라이언트 코드인 Service 클래스에 의존성만 변경해주면 쉽게 Adapter 변경이 가능하다.
 * Service 클래스는 Adapter가 동작하는 방법을 모른다.
 * 본인이 원하는 타입으로만 넘어오면 된다.
 * Adapter가 검색을 하고 응답값이 일치하지 않을경우 Adapter 내부에서 클라이언트가 원하는 타입으로 변경하기만 하면 된다.
 */
public class AdapterMain {

    public static void main(String[] args) {
        //DI 조립
        // SearchAdapter searchAdapter = new DbSearchAdapter();
        SearchAdapter searchAdapter = new WebSearchAdapter();
        SearchService searchService = new SearchServiceImpl(searchAdapter);
        SearchController searchController = new SearchController(searchService);

        String search = searchController.get("search");
        System.out.println(search);
    }

}
