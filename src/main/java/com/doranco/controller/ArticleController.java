package com.doranco.controller;

import com.doranco.entity.Article;
import com.doranco.entity.Categorie;
import com.doranco.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable long id) {
        return articleRepository.findById(id);
    }

    @GetMapping("/categorie/{categorie}")
    public List<Article> getArticlesByCategorie(@PathVariable Categorie categorie) {
        return articleRepository.findByCategorie(categorie);
    }
}
