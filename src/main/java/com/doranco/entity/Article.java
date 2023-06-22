package com.doranco.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "prix")
    private double prix;
    
    @Column(name = "remise")
    private double remise;
    
    @Column(name = "stock")
    private int stock;
    
    @Column(name = "vendable")
    private boolean isVendable;
    
    @Column(name = "photos")
    private String photos;
    
    @Column(name = "videos")
    private String videos;

    @OneToMany(mappedBy = "article")
    private List<Commentaire> commentaires;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;


}
