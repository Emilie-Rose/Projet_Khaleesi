package com.doranco.services;

import com.doranco.entity.ArticlePanier;
import com.doranco.repository.ArticlePanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlePanierService {

    private final ArticlePanierRepository articlePanierRepository;

    @Autowired
    public ArticlePanierService(ArticlePanierRepository articlePanierRepository) {
        this.articlePanierRepository = articlePanierRepository;
    }

    public List<ArticlePanier> getAllArticlesPanier() {
        return articlePanierRepository.findAll();
    }

    public ArticlePanier getArticlePanierById(Long id) {
        return articlePanierRepository.findById(id).orElse(null);
    }

    public ArticlePanier createArticlePanier(ArticlePanier articlePanier) {
        return articlePanierRepository.save(articlePanier);
    }

    public ArticlePanier updateArticlePanier(ArticlePanier articlePanier) {
        return articlePanierRepository.save(articlePanier);
    }

    public void deleteArticlePanier(Long id) {
        articlePanierRepository.deleteById(id);
    }
}
