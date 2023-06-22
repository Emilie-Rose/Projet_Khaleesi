package com.doranco.controller;

import com.doranco.entity.ArticlePanier;
import com.doranco.repository.ArticlePanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article-panier")
public class ArticlePanierController {

    private final ArticlePanierRepository articlePanierRepository;

    @Autowired
    public ArticlePanierController(ArticlePanierRepository articlePanierRepository) {
        this.articlePanierRepository = articlePanierRepository;
    }

    @GetMapping("/{id}")
    public ArticlePanier getArticlePanierById(@PathVariable long id) {
        return articlePanierRepository.findById(id);
    }

}

