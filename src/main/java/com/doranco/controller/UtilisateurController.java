package com.doranco.controller;

import com.doranco.entity.Adresse;
import com.doranco.entity.Article;
import com.doranco.entity.Profil;
import com.doranco.entity.Utilisateur;
import com.doranco.repository.UtilisateurRepository;
import com.doranco.services.ArticleService;
import com.doranco.services.UtilisateurService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Data
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurController(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    @Autowired
	private UtilisateurService utilisateurService;

	@Autowired
	private ArticleService articleService;

    @GetMapping("/nom/{nom}")
    public Utilisateur getUtilisateurByNom(@PathVariable String nom) {
        return utilisateurRepository.findByNom(nom);
    }

    @GetMapping("/prenom/{prenom}")
    public Utilisateur getUtilisateurByPrenom(@PathVariable String prenom) {
        return utilisateurRepository.findByPrenom(prenom);
    }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable long id) {
        return utilisateurRepository.findById(id);
    }

    @GetMapping("/email/{email}")
    public Utilisateur getUtilisateurByEmail(@PathVariable String email) {
        return utilisateurRepository.findByEmail(email);
    }

    @GetMapping("/adresse/{adresse}")
    public Utilisateur getUtilisateurByAdresse(@PathVariable Adresse adresse) {
        return utilisateurRepository.findByAdresses(adresse);
    }

    @GetMapping("/profil/{profil}")
    public Utilisateur getUtilisateurByProfil(@PathVariable Profil profil) {
        return utilisateurRepository.findByProfil(profil);
    }

    @GetMapping("/register")
	public String registerUtilisateur()
	{
		return "register";
	}

	@GetMapping("/payer")
	public String payer()
	{
		return "payer";
	}
	

	@GetMapping("/")
	public String utilisateurlogin(Model model) {
		
		return "utilisateurLogin";
	}

    @RequestMapping(value = "userloginvalide", method = RequestMethod.POST)
	public ModelAndView utilisateurlogin( @RequestParam("prenom") String prenom, @RequestParam("password") String pass,Model model,HttpServletResponse res) {
		
		System.out.println(pass);
		Utilisateur u = this.utilisateurService.checkLogin(prenom, pass);
		System.out.println(u.getPrenom());
		if(u.getPrenom().equals(prenom)) {	
			
			res.addCookie(new Cookie("prenom", u.getPrenom()));
			ModelAndView mView  = new ModelAndView("accueil");	
			mView.addObject("utilisateur", u);

			List<Article> articles = this.articleService.getAllArticles();

			if (articles.isEmpty()) {
				mView.addObject("msg", "aucun article disponible");
			} else {
				mView.addObject("articles", articles);
			}
			return mView;

		}else {
			ModelAndView mView = new ModelAndView("utilisateurLogin");
			mView.addObject("msg", "svp entrez un email et un mot de passe valides");
			return mView;
		}
		
	}
	
	
	@GetMapping("/utilisateur/articles")
	public ModelAndView getarticle() {

		ModelAndView mView = new ModelAndView("article");

		List<Article> articles = this.articleService.getAllArticles();

		if(articles.isEmpty()) {
			mView.addObject("msg","Aucun produit n'est disponible");
		}else {
			mView.addObject("articles",articles);
		}

		return mView;
	}
	@RequestMapping(value = "newuserregister", method = RequestMethod.POST)
	public String newUserRegister(@ModelAttribute Utilisateur utilisateur)
	{
		
		System.out.println(utilisateur.getEmail());
		utilisateur.setProfil("CLIENT");
		this.utilisateurService.addUtilisateur(utilisateur);
		
		return "redirect:/";
	}
	
	
	
	   
/* 		@GetMapping("/test")
		public String Test(Model model)
		{
			System.out.println("test page");
			model.addAttribute("author","jay gajera");
			model.addAttribute("id",40);
			
			List<String> friends = new ArrayList<String>();
			model.addAttribute("f",friends);
			friends.add("123");
			friends.add("aze");
			
			return "test";
		}
 */		
		
/* 		@GetMapping("/test2")
		public ModelAndView Test2()
		{
			System.out.println("test page2");
			ModelAndView mv=new ModelAndView();
			mv.addObject("name","lola lolo 96");
			mv.addObject("id",40);
			mv.setViewName("test2");
			
			List<Long> list=new ArrayList<Long>();
			list.add(10);
			list.add(25);
			mv.addObject("mark",list);
			return mv;
			
			
		}
 */}
