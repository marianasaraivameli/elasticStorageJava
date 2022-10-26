package com.example.elasticstoragejava.controller;

import com.example.elasticstoragejava.model.Article;
import com.example.elasticstoragejava.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id){
        Optional<Article> article = service.findById(id);
        if(article.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(article.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Artigo removido", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Article> update(@RequestBody Article article) {
        Article updateArticle = service.update(article);
        return new ResponseEntity<>(updateArticle, HttpStatus.OK);
    }

}
