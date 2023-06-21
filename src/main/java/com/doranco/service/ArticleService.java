package com.doranco.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Article;
import com.doranco.repository.ArticleRepository;

@Service
public class ArticleService {
    @Autowired
	private ArticleRepository articleRepository;
	
	public Iterable<Article> getProducts() {
		return articleRepository.findAll();
	}
	
	public Optional<Article> getProductById(Integer id) {
		return articleRepository.findById(id);
	}	
}
