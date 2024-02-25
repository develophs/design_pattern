package choi.adapter.service;

import choi.adapter.controller.port.SearchService;
import choi.adapter.service.port.SearchAdapter;

public class SearchServiceImpl implements SearchService {

    private final SearchAdapter searchAdapter;

    public SearchServiceImpl(final SearchAdapter searchAdapter) {
        this.searchAdapter = searchAdapter;
    }

    @Override
    public String search(final String keyword) {
        return searchAdapter.search(keyword);
    }
}
