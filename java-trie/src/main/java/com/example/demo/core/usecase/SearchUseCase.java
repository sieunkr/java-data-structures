package com.example.demo.core.usecase;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchUseCase {

    private final Searchable searchable;

    public SearchUseCase(Searchable searchable) {
        this.searchable = searchable;
    }

    public List<?> searchByQuery(String query){
        return searchable.searchByQuery(query);
    }


}
