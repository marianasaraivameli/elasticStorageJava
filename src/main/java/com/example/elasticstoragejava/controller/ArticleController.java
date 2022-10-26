package com.example.elasticstoragejava.controller;

import com.example.elasticstoragejava.model.Article;
import com.example.elasticstoragejava.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService service;

    @PostMapping
    public ResponseEntity<Article> insert(@RequestBody Article article) {
        Article newArticle = service.save(article);

        return new ResponseEntity<>(newArticle, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Article>> getAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
