package com.doranco.controller;

import com.doranco.entity.Article;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.ArticleRepository;
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
public class AddArticleController {
    private final ArticleRepository articleRepository;

    @Autowired
    public AddArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/add-article")
    public String showArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "article_form.html";
    }
    @PostMapping("/add-article")
    public RedirectView addArticle(@ModelAttribute("article") @Validated Article article,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new RedirectView("/add-article?error");
        }

        Article savedArcticle = articleRepository.save(article);
        else{
            return new RedirectView("/gestion-achat.html");
        }
    }
}
