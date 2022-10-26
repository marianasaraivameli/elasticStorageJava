package com.example.elasticstoragejava.service;

import com.example.elasticstoragejava.model.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleService {
    Article save(Article article);
    List<Article> findAll();
    Optional<Article> findById(int id);
    void delete(int id);
    Article update(Article article);
}
