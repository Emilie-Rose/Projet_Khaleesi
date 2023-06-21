package com.doranco.repository;

import com.doranco.entity.Adresse;
import com.doranco.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

    Adresse findByVille(String ville);
    
    Adresse findByCodePostal(String codePostal);
    
    Adresse findById(long id);
    
    Adresse findByUtilisateur(Utilisateur utilisateur);
}
