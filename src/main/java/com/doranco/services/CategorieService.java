package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.repository.CategorieRepository;
import com.doranco.entity.Categorie;


@Service
public class CategorieService {
    @Autowired
	private CategorieRepository categorieRepository;
	

	public List<Categorie> getCategories()
	{

		return categorieRepository.findAll();

	}

}
