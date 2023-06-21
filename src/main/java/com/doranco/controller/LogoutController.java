package com.doranco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@RequestMapping("/deconnexion")
    public ModelAndView accueil(Model model) {
        


        model.addAttribute("data","Au Revoir " );
        return new ModelAndView("accueil.html");
    }
}
