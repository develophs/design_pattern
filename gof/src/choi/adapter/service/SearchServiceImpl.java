package choi.adapter.service;

import choi.adapter.controller.port.SearchService;
import choi.adapter.service.port.SearchPort;

public class SearchServiceImpl implements SearchService {

    private final SearchPort searchPort;

    public SearchServiceImpl(final SearchPort searchPort) {
        this.searchPort = searchPort;
    }

    @Override
    public String search(final String keyword) {
        return searchPort.search(keyword);
    }
}
