package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.repository.CategorieRepository;
import com.doranco.entity.Categorie;


@Service
public class CategorieService {
	private final CategorieRepository categorieRepository;

	@Autowired
	public CategorieService(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

	public Categorie getCategorieById(Long id) {
		return categorieRepository.findById(id).orElse(null);
	}

	public Categorie createCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	public Categorie updateCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	public void deleteCategorie(Long id) {
		categorieRepository.deleteById(id);
	}

}
