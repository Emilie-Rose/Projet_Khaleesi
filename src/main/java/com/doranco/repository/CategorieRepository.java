package com.doranco.repository;

import com.doranco.entity.Categorie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    @Autowired
    void setSessionFactory(SessionFactory sessionFactory);

    Categorie findByNom(String nom);

    Categorie findByRemise(String remise);

    Categorie findById(long id);

    @Transactional
    default Categorie addCategory(String nom) {
        Categorie category = new Categorie();
        category.setNom(nom);
        Session session = getSessionFactory().getCurrentSession();
        session.persist(category);
        return category;
    }

    @Transactional
    default List<Categorie> getCategories() {
        Session session = getSessionFactory().getCurrentSession();
        return session.createQuery("FROM Categorie", Categorie.class).list();
    }

    @Transactional
    default Boolean deleteCategory(Long id) {
        Session session = getSessionFactory().getCurrentSession();
        Categorie category = session.get(Categorie.class, id);
        if (category != null) {
            session.remove(category);
            return true;
        }
        return false;
    }

    @Transactional
    default Categorie updateCategory(Long id, String nom) {
        Session session = getSessionFactory().getCurrentSession();
        Categorie category = session.get(Categorie.class, id);
        category.setNom(nom);
        session.merge(category);
        return category;
    }

    @Transactional
    default Categorie getCategory(Long id) {
        Session session = getSessionFactory().getCurrentSession();
        return session.get(Categorie.class, id);
    }

    SessionFactory getSessionFactory();
}
