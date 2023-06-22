package com.doranco.repository;

import com.doranco.entity.Adresse;
import com.doranco.entity.ProfilsUtilisateur;
import com.doranco.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    
    Utilisateur findByNom(String nom);
    
    Utilisateur findByPrenom(String prenom);
    
    Utilisateur findById(long id);
    
    Utilisateur findByEmail(String email);
    
    Utilisateur findByAdresses(Adresse adresse);
    
    Utilisateur findByProfil(ProfilsUtilisateur profil);
    
    Utilisateur findByEmailAndPassword(String email, String password);
}

