package com.example.demo.providers.storage;

import com.example.demo.core.entity.Trie;
import com.example.demo.core.usecase.Searchable;
import com.example.demo.core.usecase.Trieable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrieStorageProvider implements Searchable, Trieable {

    private final Trie trie;

    public TrieStorageProvider(Trie trie) {
        this.trie = trie;
    }

    @Override
    public List<String> searchByQuery(String query) {
        System.out.println(trie.containsNode(query));
        return null;
    }

    @Override
    public void syncByQuery(Object object) {

    }

    @Override
    public void insertTrieNode(String n) {
        trie.insert(n);
    }
}
