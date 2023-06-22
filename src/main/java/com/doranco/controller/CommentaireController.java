package com.doranco.controller;

import com.doranco.entity.Commentaire;
import com.doranco.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commentaires")
public class CommentaireController {

    private final CommentaireRepository commentaireRepository;

    @Autowired
    public CommentaireController(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    @GetMapping("/{id}")
    public Commentaire getCommentaireById(@PathVariable long id) {
        return commentaireRepository.findById(id);
    }

    // Ajoutez d'autres méthodes de contrôleur si nécessaire
}
