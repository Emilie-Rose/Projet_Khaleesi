// UtilisateurController.java

package com.doranco.controller;

import com.doranco.entity.Utilisateur;
import com.doranco.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public LoginController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

	@RequestMapping("/login")
    public ModelAndView accueil(Model model) {
        


        model.addAttribute("data","Au Revoir " );
        return new ModelAndView("login-utilisateur.html");
    }

    @PostMapping("/login")
    public RedirectView login(@RequestParam("email") String email,
                              @RequestParam("password") String password,
                              Model model) {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);

        if (utilisateur != null && utilisateur.getPassword().equals(password)) {
            return new RedirectView("/gestion-achats.html");
        } else {
            return new RedirectView("/login");
        }
    }
}
