package com.example.elasticstoragejava.repository;

import com.example.elasticstoragejava.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepository extends ElasticsearchRepository<Article, Integer> {
}
