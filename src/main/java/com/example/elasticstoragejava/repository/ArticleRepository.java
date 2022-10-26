package com.example.elasticstoragejava.repository;

import com.example.elasticstoragejava.model.Article;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ArticleRepository extends ElasticsearchRepository<Article, Integer> {
    // usando querys create
    @Query("{\"match_all\": {}}")
    List<Article> findAll();
}
