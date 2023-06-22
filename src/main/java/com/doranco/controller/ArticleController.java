package com.doranco.controller;

import com.doranco.entity.Article;
import com.doranco.entity.Categorie;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/* import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 */import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ArticleController {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/article/{id}")
    public Article getArticleById(@PathVariable long id) {
        return articleRepository.findById(id);
    }
    @GetMapping("/gestion")
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }
    @GetMapping("/article")
    public String showArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "/article.html";
    }
 @PostMapping("/article")
    public RedirectView addArticle(@ModelAttribute("article") @Validated Article article,
                                     BindingResult bindingResult) {
        Article savedArticle = articleRepository.save(article);

            return new RedirectView("/gestion-achat.html");
    }
    @GetMapping("/categorie/{categorie}")
    public List<Article> getArticlesByCategorie(@PathVariable Categorie categorie) {
        return articleRepository.findByCategorie(categorie);
    }
    
}
