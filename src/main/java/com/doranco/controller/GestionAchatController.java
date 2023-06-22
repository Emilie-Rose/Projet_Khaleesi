package com.doranco.controller;

import com.doranco.services.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GestionAchatController {

	private ArticleService articleService;
	
	@RequestMapping("/gestion")
    public ModelAndView accueil(Model model) {
        

        model.addAttribute("listArticles",articleService.getAllArticles() );
        return new ModelAndView("gestion-achats.html");
    }
}
