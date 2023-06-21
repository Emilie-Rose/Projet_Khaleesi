package com.doranco.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
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

    @OneToOne
    @JoinColumn(name = "adresse_facturation_id")
    private Adresse adresseFacturation;

    @OneToOne
    @JoinColumn(name = "adresse_livraison_id")
    private Adresse adresseLivraison;

    @OneToOne
    @JoinColumn(name = "carte_paiement_defaut_id")
    private CartePaiement cartePaiementDefaut;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "commande")
    private List<LigneDeCommande> lignesCommande;


    public Commande() {
    }
}