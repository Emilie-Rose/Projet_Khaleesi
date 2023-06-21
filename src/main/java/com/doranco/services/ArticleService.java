package com.doranco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Article;
import com.doranco.repository.ArticleRepository;

@Service
public class ArticleService {
    @Autowired
	private ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public ArticleService() {
	}

	public List<Article> recuperationArticles()
	{

		return articleRepository.findAll();

	}
}