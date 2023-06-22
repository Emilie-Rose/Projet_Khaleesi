package com.doranco.repository;

import com.doranco.entity.CartePaiement;
import com.doranco.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartePaiementRepository extends JpaRepository<CartePaiement, Long> {

    CartePaiement findByNomProprietaire(String nomProprietaire);
    
    CartePaiement findByNumero(String numero);
    
    CartePaiement findById(long id);
    
    CartePaiement findByUtilisateur(Utilisateur utilisateur);
}

