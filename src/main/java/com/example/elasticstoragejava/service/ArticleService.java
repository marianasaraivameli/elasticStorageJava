package com.example.elasticstoragejava.service;

import com.example.elasticstoragejava.model.Article;
import com.example.elasticstoragejava.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService{

    @Autowired
    private ArticleRepository repository;

    @Override
    public Article save(Article article) {
        return repository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return (List<Article>) repository.findAll();
    }
}
