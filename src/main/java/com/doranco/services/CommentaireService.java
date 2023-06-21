package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.entity.Commentaire;
import com.doranco.repository.CommentaireRepository;

@Service
public class CommentaireService {
    @Autowired
	private CommentaireRepository commentaireRepository;
	
	public List<Commentaire> getCommentaires() {
		return commentaireRepository.findAll();
	}}
	
