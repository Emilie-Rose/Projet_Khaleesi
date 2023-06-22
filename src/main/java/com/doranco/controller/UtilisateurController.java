package com.doranco.controller;

import com.doranco.entity.Adresse;
import com.doranco.entity.Profil;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/nom/{nom}")
    public Utilisateur getUtilisateurByNom(@PathVariable String nom) {
        return utilisateurRepository.findByNom(nom);
    }

    @GetMapping("/prenom/{prenom}")
    public Utilisateur getUtilisateurByPrenom(@PathVariable String prenom) {
        return utilisateurRepository.findByPrenom(prenom);
    }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable long id) {
        return utilisateurRepository.findById(id);
    }

    @GetMapping("/email/{email}")
    public Utilisateur getUtilisateurByEmail(@PathVariable String email) {
        return utilisateurRepository.findByEmail(email);
    }

    @GetMapping("/adresse/{adresse}")
    public Utilisateur getUtilisateurByAdresse(@PathVariable Adresse adresse) {
        return utilisateurRepository.findByAdresses(adresse);
    }

    @GetMapping("/profil/{profil}")
    public Utilisateur getUtilisateurByProfil(@PathVariable Profil profil) {
        return utilisateurRepository.findByProfil(profil);
    }
}
