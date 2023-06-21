package com.doranco.repository;

import com.doranco.entity.Commande;
import com.doranco.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    Commande findByNumero(String numero);
    
    Commande findById(long id);
    
    List<Commande> findByUtilisateur(Utilisateur utilisateur);
}

