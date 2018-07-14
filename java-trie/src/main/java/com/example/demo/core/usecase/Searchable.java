package com.example.demo.core.usecase;

import java.util.List;

public interface Searchable {

    List<?> searchByQuery(String query); //쿼리로 시작하는 모든 키워드 조회
    List<?> findByQuery(String query); //쿼리와 완벽하게 일치하는 키워드 조회

    void syncByQuery(Object object);

}
