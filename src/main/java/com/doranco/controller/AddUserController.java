package com.doranco.controller;

import com.doranco.entity.Utilisateur;
import com.doranco.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AddUserController {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public AddUserController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "add-utilisateur";
    }

    @PostMapping("/register")
    public RedirectView registerUtilisateur(@ModelAttribute("utilisateur") @Validated Utilisateur utilisateur,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new RedirectView("/register?error");
        }

        //utilisateur.setDateNaissance(LocalDate.parse(utilisateur.getDateNaissance().toString()));
        utilisateur.setActif(true);

        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);

        boolean isRegistered = savedUtilisateur != null;
        if (isRegistered) {
            return new RedirectView("/login");
        } else {
            return new RedirectView("/register?error");
        }
    }
}
