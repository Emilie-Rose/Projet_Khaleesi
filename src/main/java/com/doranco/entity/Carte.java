package com.doranco.entity;

import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="carte")
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "carte_id"),
            inverseJoinColumns = @JoinColumn(name = "article_id")
    )
    private List<Article> articles;
   
    public Carte() {
        articles = new ArrayList<>();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void removeArticle(Article article) {
        articles.remove(article);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    public List<Article> getArticles() {
        return articles;
    }
    
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
