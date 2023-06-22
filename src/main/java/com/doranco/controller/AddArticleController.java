package com.doranco.controller;

import com.doranco.entity.Article;
import com.doranco.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
