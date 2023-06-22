package com.doranco.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "categories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "remise")
    private double remise;
    
    @Column(name = "is_remise_cumulable")
    private boolean isRemiseCumulable;
    
    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;


}
