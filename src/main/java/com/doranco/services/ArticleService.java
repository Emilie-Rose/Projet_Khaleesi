package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Article;
import com.doranco.repository.ArticleRepository;

@Service
public class ArticleService {
	private final ArticleRepository articleRepository;

	@Autowired
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}

	public Article getArticleById(Long id) {
		return articleRepository.findById(id).orElse(null);
	}

	public Article createArticle(Article article) {
		return articleRepository.save(article);
	}

	public Article updateArticle(Article article) {
		return articleRepository.save(article);
	}

	public void deleteArticle(Long id) {
		articleRepository.deleteById(id);
	}
}
