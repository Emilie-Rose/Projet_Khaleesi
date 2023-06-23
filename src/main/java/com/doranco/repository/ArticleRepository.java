package com.doranco.repository;

import com.doranco.entity.Article;
import com.doranco.entity.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findById(long id);

    List<Article> findByCategorie(Categorie categorie);
    }


