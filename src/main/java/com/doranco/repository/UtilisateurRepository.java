package com.doranco.repository;

import com.doranco.entity.Adresse;
import com.doranco.entity.Profil;
import com.doranco.entity.Utilisateur;

import jakarta.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findByNom(String nom);

    Utilisateur findByPrenom(String prenom);

    Utilisateur findById(long id);

    Utilisateur findByEmail(String email);

    Utilisateur findByAdresses(Adresse adresse);

    Utilisateur findByProfil(Profil profil);

    Utilisateur findByEmailAndPassword(String email, String password);

    @Autowired
    void setSessionFactory(SessionFactory sessionFactory);

    @Transactional
    default List<Utilisateur> getAllUtilisateur() {
        return findAll();
    }

    @Transactional
    default Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return saveAndFlush(utilisateur);
    }

}