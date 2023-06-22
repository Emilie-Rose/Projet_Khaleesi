package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Commentaire;
import com.doranco.repository.CommentaireRepository;

@Service
public class CommentaireService {
	private final CommentaireRepository commentaireRepository;

	@Autowired
	public CommentaireService(CommentaireRepository commentaireRepository) {
		this.commentaireRepository = commentaireRepository;
	}

	public List<Commentaire> getAllCommentaires() {
		return commentaireRepository.findAll();
	}

	public Commentaire getCommentaireById(Long id) {
		return commentaireRepository.findById(id).orElse(null);
	}

	public Commentaire createCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	public Commentaire updateCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	public void deleteCommentaire(Long id) {
		commentaireRepository.deleteById(id);
	}
}
	
