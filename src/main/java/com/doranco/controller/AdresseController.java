package com.doranco.controller;

import com.doranco.entity.Adresse;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adresses")
public class AdresseController {

    private final AdresseRepository adresseRepository;

    @Autowired
    public AdresseController(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @GetMapping("/ville/{ville}")
    public Adresse getAdresseByVille(@PathVariable String ville) {
        return adresseRepository.findByVille(ville);
    }

    @GetMapping("/codePostal/{codePostal}")
    public Adresse getAdresseByCodePostal(@PathVariable String codePostal) {
        return adresseRepository.findByCodePostal(codePostal);
    }

    @GetMapping("/{id}")
    public Adresse getAdresseById(@PathVariable long id) {
        return adresseRepository.findById(id);
    }

    @GetMapping("/utilisateur/{utilisateur}")
    public Adresse getAdresseByUtilisateur(@PathVariable Utilisateur utilisateur) {
        return adresseRepository.findByUtilisateur(utilisateur);
    }
}
