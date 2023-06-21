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
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key
    
    @Column(name = "contenu")
    private String texte;
    
    @Column(name = "note")
    private int note; // note sur 5
    
    // @JoinColumn(name = "article_id")
    // private Article article;
    
    // @JoinColumn(name = "user_id")
    // private Utilisateur utilisateur;




}
