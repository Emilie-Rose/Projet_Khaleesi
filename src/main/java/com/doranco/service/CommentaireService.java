package com.doranco.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Commentaire;
import com.doranco.repository.CommentaireRepository;

@Service
public class CommentaireService {
    @Autowired
	private CommentaireRepository commentaireRepository;
	
	public Iterable<Commentaire> getComments() {
		return commentaireRepository.findAll();
	}
	
	public Optional<Commentaire> getCommentById(Integer id) {
		return commentaireRepository.findById(id);
	}
}
