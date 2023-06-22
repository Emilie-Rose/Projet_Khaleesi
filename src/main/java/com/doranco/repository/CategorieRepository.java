package com.doranco.repository;

import com.doranco.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    Categorie findById(long id);
    
    // Ajoutez d'autres méthodes de requête personnalisées si nécessaire
}

