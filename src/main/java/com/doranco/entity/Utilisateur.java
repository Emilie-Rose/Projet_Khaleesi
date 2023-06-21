package com.doranco.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name = "date_naissance")
    private String dateNaissance;
    
    @Column(name = "is_actif")
    private boolean isActif;
    
    @Column(name = "profil")
    private String profil;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "telephone")
    private String telephone;
    
    @Column(name = "adresse")
    private String adresse;

    
    // @Column(name = "adresses")
    // private List<Adresse> adresses;
    
    // @Column(name = "commandes")
    // private List<Commande> commandes;
    
    // @Column(name = "commentaires")
    // private List<Commentaire> commentaires;
    
    // @Column(name = "panier")
    // private Panier panier;




}
