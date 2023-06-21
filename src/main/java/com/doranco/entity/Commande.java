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
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "date_creation")
    private String dateCreation;
    
    @Column(name = "date_livraison")
    private String dateLivraison;
    
    @Column(name = "total_remise")
    private double totalRemise;
    
    @Column(name = "frais_expedition")
    private double fraisExpedition;
    
    @Column(name = "total_general")
    private double totalGeneral;
    
    @Column(name = "adresse_facturation")
    private String adresseFacturation;
    
    @Column(name = "adresse_livraison")
    private String adresseLivraison;

    // @JoinColumn(name = "user_id")
    // private Utilisateur utilisateur;

    // @OneToMany(mappedBy = "commande")
    // private List<LigneDeCommande> ligneDeCommandes;


    public Commande() {
    }
}