package com.doranco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doranco.repository.UtilisateurRepository;
import com.doranco.entity.Utilisateur;
@Service
public class UtilisateurService {
	@Autowired
	private UtilisateurRepository  utilisateurRepository;
	
	public List<Utilisateur> getAllUtilisateurs(){
		return this.utilisateurRepository.getAllUtilisateur();
	}
	
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		return this.utilisateurRepository.saveUtilisateur(utilisateur);
	}
	
	public Utilisateur checkLogin(String email,String password) {
		return this.utilisateurRepository.findByEmailAndPassword(email, password);
	}

	
}