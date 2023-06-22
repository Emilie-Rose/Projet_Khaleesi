package com.doranco.services;

import com.doranco.entity.LigneDeCommande;
import com.doranco.repository.LigneDeCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneDeCommandeService {

    private final LigneDeCommandeRepository ligneDeCommandeRepository;

    @Autowired
    public LigneDeCommandeService(LigneDeCommandeRepository ligneDeCommandeRepository) {
        this.ligneDeCommandeRepository = ligneDeCommandeRepository;
    }

    public List<LigneDeCommande> getAllLignesDeCommande() {
        return ligneDeCommandeRepository.findAll();
    }

    public LigneDeCommande getLigneDeCommandeById(Long id) {
        return ligneDeCommandeRepository.findById(id).orElse(null);
    }

    public LigneDeCommande createLigneDeCommande(LigneDeCommande ligneDeCommande) {
        return ligneDeCommandeRepository.save(ligneDeCommande);
    }

    public LigneDeCommande updateLigneDeCommande(LigneDeCommande ligneDeCommande) {
        return ligneDeCommandeRepository.save(ligneDeCommande);
    }

    public void deleteLigneDeCommande(Long id) {
        ligneDeCommandeRepository.deleteById(id);
    }
}
