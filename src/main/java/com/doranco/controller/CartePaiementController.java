package com.doranco.controller;

import com.doranco.entity.CartePaiement;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.CartePaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartes-paiement")
public class CartePaiementController {

    private final CartePaiementRepository cartePaiementRepository;

    @Autowired
    public CartePaiementController(CartePaiementRepository cartePaiementRepository) {
        this.cartePaiementRepository = cartePaiementRepository;
    }

    @GetMapping("/proprietaire/{nomProprietaire}")
    public CartePaiement getCartePaiementByNomProprietaire(@PathVariable String nomProprietaire) {
        return cartePaiementRepository.findByNomProprietaire(nomProprietaire);
    }

    @GetMapping("/numero/{numero}")
    public CartePaiement getCartePaiementByNumero(@PathVariable String numero) {
        return cartePaiementRepository.findByNumero(numero);
    }

    @GetMapping("/{id}")
    public CartePaiement getCartePaiementById(@PathVariable long id) {
        return cartePaiementRepository.findById(id);
    }

    @GetMapping("/utilisateur/{utilisateur}")
    public CartePaiement getCartePaiementByUtilisateur(@PathVariable Utilisateur utilisateur) {
        return cartePaiementRepository.findByUtilisateur(utilisateur);
    }
}

