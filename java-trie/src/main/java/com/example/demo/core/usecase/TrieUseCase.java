package com.example.demo.core.usecase;

import org.springframework.stereotype.Service;

@Service
public class TrieUseCase {

    private final Trieable trieable;

    public TrieUseCase(Trieable trieable) {
        this.trieable = trieable;
    }

    public void insertTrieNode(String keyword, Integer cid){
        trieable.insertTrieNode(keyword, cid);
    }

    public void deleteTrieNode(String keyword){
        trieable.deleteTrieNode(keyword);
    }



}
