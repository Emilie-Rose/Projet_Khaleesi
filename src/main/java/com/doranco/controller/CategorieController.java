package com.doranco.controller;

import com.doranco.entity.Categorie;
import com.doranco.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    private final CategorieRepository categorieRepository;

    @Autowired
    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @GetMapping("/{id}")
    public Categorie getCategorieById(@PathVariable long id) {
        return categorieRepository.findById(id);
    }

    // Ajoutez d'autres méthodes de contrôleur si nécessaire
}

