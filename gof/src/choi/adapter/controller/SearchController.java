package choi.adapter.controller;

import choi.adapter.controller.port.SearchService;

public class SearchController {

    private final SearchService searchService;

    public SearchController(final SearchService searchService) {
        this.searchService = searchService;
    }

    public String get(String keyword) {
        return searchService.search(keyword);
    }
}
