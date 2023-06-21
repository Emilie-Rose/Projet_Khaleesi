package com.doranco.controller;

import com.doranco.entity.Commande;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeController(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @GetMapping("/numero/{numero}")
    public Commande getCommandeByNumero(@PathVariable String numero) {
        return commandeRepository.findByNumero(numero);
    }

    @GetMapping("/{id}")
    public Commande getCommandeById(@PathVariable long id) {
        return commandeRepository.findById(id);
    }

    @GetMapping("/utilisateur/{utilisateur}")
    public List<Commande> getCommandesByUtilisateur(@PathVariable Utilisateur utilisateur) {
        return commandeRepository.findByUtilisateur(utilisateur);
    }
}
