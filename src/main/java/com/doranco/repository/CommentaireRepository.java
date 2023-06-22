package com.doranco.repository;

import com.doranco.entity.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

    Commentaire findById(long id);
    
    // Ajoutez d'autres méthodes de requête personnalisées si nécessaire
}

