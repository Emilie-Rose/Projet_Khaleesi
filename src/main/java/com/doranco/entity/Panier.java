package com.doranco.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// @Entity
@Data
@Table(name = "panier")
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Utilisateur utilisateur;

    // private List<ArticlePanier> articlesPaniers;

    // public Panier() {
    //     this.articlesPaniers = new ArrayList<>();
    // }

    // public void ajouterArticle(ArticlePanier article) {
    //     articlesPaniers.add(article);
    // }

    // public void retirerArticle(ArticlePanier article) {
    //     articlesPaniers.remove(article);
    // }

    // public void viderPanier() {
    //     articlesPaniers.clear();
    // }

    // public double calculerMontantTotal() {
    //     double montantTotal = 0.0;
    //     for (ArticlePanier article : articlesPaniers) {
    //         double prixUnitaire = article.getArticle().getPrix();
    //         int quantite = article.getQuantite();
    //         montantTotal += prixUnitaire * quantite;
    //     }
    //     return montantTotal;
    // }

    // @Override
    // public String toString() {
    //     return "Panier{" +
    //             "id=" + id +
    //             ", utilisateur=" + utilisateur +
    //             ", articles=" + articlesPaniers +
    //             '}';
    // }
}