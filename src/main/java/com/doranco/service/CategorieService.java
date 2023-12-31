package com.doranco.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.repository.CategorieRepository;
import com.doranco.entity.Categorie;


@Service
public class CategorieService {
    @Autowired
	private CategorieRepository categorieRepository;
	
	public Iterable<Categorie> getCategories() {
		return categorieRepository.findAll();
	}
	
	public Optional<Categorie> getCategoryById(Integer id) {
		return categorieRepository.findById(id);
	}

}
