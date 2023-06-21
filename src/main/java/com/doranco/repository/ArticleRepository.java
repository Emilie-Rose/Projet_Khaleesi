package com.doranco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doranco.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
