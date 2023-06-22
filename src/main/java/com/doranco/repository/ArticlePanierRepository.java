package com.doranco.repository;

import com.doranco.entity.ArticlePanier;
import com.doranco.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlePanierRepository extends JpaRepository<ArticlePanier, Long> {

    ArticlePanier findById(long id);
    
    List<ArticlePanier> findByUtilisateur(Utilisateur utilisateur);
}

