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
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "remise")
    private int remise;
    
    @Column(name = "is_remise_cumulable")
    private boolean isRemiseCumulable;
    
    @Column(name = "photo")
    private String photo;
    // @Column(name = "articles")
    // private List<Article> articles;


}
