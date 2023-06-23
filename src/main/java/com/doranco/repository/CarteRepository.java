package com.doranco.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.doranco.entity.Carte;
import com.doranco.entity.Utilisateur;

@Repository
public class CarteRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Transactional
    public Carte addCarte(Carte carte) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(carte);
        return carte;
    }

    @Transactional
    public List<Carte> getCartes() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Carte", Carte.class).list();
    }

    @Transactional
    public void updateCarte(Carte carte) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(carte);
    }

    @Transactional
    public void deleteCarte(Carte carte) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(carte);
    }

    @Transactional
    public Carte findByUtilisateur(Utilisateur utilisateur) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Carte WHERE utilisateur = :utilisateur", Carte.class)
                .setParameter("utilisateur", utilisateur)
                .uniqueResult();
    }
}