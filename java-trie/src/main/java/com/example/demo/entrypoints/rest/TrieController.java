package com.example.demo.entrypoints.rest;

import com.example.demo.core.usecase.TrieUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nodes")
public class TrieController {

    private final TrieUseCase trieUseCase;

    public TrieController(TrieUseCase trieUseCase) {
        this.trieUseCase = trieUseCase;
    }

    @GetMapping
    public void insertNode(@RequestParam(name="node") String node){
        trieUseCase.insertTrieNode(node);
    }

}
