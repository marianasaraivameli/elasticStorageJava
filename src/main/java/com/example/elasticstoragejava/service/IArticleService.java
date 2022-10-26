package com.example.elasticstoragejava.service;

import com.example.elasticstoragejava.model.Article;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    List<Article> findAll();
}
