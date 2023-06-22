package com.doranco.controller;

import com.doranco.entity.Commande;
import com.doranco.entity.LigneDeCommande;
import com.doranco.repository.LigneDeCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lignes-de-commande")
public class LigneDeCommandeController {

    private final LigneDeCommandeRepository ligneDeCommandeRepository;

    @Autowired
    public LigneDeCommandeController(LigneDeCommandeRepository ligneDeCommandeRepository) {
        this.ligneDeCommandeRepository = ligneDeCommandeRepository;
    }

    @GetMapping("/{id}")
    public LigneDeCommande getLigneDeCommandeById(@PathVariable long id) {
        return ligneDeCommandeRepository.findById(id);
    }

    @GetMapping("/commande/{commande}")
    public List<LigneDeCommande> getLignesDeCommandeByCommande(@PathVariable Commande commande) {
        return ligneDeCommandeRepository.findByCommande(commande);
    }
}
