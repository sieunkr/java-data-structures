package com.example.demo.core.usecase;

import java.util.List;

public interface Searchable {

    List<?> searchByQuery(String query);
    void syncByQuery(Object object);
}
