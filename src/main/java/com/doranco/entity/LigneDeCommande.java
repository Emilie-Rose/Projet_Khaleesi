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
@Table(name = "ligneDeCommande")
public class LigneDeCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "quantite")
    private int quantite;
    
    @Column(name = "prix_unitaire")
    private double prixUnitaire;
    
    @Column(name = "remise_article")
    private double remiseArticle;
    
    // @JoinColumn(name = "commande_id")
    // private Commande commande;
    
    // @JoinColumn(name = "article_id")
    // private Article article;


}
