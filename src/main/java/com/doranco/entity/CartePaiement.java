package com.doranco.entity;

//import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cartes_Paiement")
public class CartePaiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key
    
    @Column(name = "nom_proprietaire")
    private String nomProprietaire;
    
    @Column(name = "prenom_proprietaire")
    private String prenomProprietaire;
    
    private String numero;
    
    @Column(name = "date_fin_validite")
    private String dateFinValidite;
    
    private String cryptogramme;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;


}
