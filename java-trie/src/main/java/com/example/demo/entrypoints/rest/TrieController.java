package com.example.demo.entrypoints.rest;

import com.example.demo.core.usecase.TrieUseCase;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/keywords")
public class TrieController {

    private final TrieUseCase trieUseCase;

    public TrieController(TrieUseCase trieUseCase) {
        this.trieUseCase = trieUseCase;
    }

    @PostMapping
    public void insertKeyword(@RequestParam(name="keyword") String keyword, @RequestParam(name="cid") Integer cid){
        trieUseCase.insertTrieNode(keyword, cid);
    }

    @DeleteMapping
    public void deleteKeyword(@RequestParam(name="keyword") String keyword){
        trieUseCase.deleteTrieNode(keyword);
    }

}
