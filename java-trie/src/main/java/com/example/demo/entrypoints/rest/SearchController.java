package com.example.demo.entrypoints.rest;

import com.example.demo.core.usecase.SearchUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/searches")
public class SearchController {

    private final SearchUseCase searchUseCase;

    public SearchController(SearchUseCase searchUseCase) {
        this.searchUseCase = searchUseCase;
    }

    @GetMapping
    public List<?> searchByQuery(@RequestParam(name="query") String query, @RequestParam(name="type", defaultValue="exact") String type){

        if("exact".equals(type)){
            return searchUseCase.findByQuery(query);
        }
        else{
            return searchUseCase.searchByQuery(query);
        }
    }

}
