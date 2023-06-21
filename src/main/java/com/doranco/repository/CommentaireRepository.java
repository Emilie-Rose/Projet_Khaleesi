package com.doranco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doranco.entity.Commentaire;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Integer> {

}
