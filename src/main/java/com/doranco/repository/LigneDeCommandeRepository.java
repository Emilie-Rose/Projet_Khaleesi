package com.doranco.repository;

import com.doranco.entity.Commande;
import com.doranco.entity.LigneDeCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande, Long> {

    LigneDeCommande findById(long id);
    
    List<LigneDeCommande> findByCommande(Commande commande);
}

