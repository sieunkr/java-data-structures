package com.example.demo.core.usecase;

import org.springframework.stereotype.Service;

@Service
public class TrieUseCase {

    private final Trieable trieable;

    public TrieUseCase(Trieable trieable) {
        this.trieable = trieable;
    }

    public void insertTrieNode(String node){
        trieable.insertTrieNode(node);
    }
}
