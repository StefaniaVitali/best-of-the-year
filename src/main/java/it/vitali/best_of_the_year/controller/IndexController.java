package it.vitali.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.vitali.best_of_the_year.model.Utente;

@Controller
public class IndexController {
	
	
	@GetMapping("/greeting")
	public String greeting( Model model) {
		
    Utente utente1 = new Utente();
    utente1.setNome("Stefania");
    utente1.setCognome("Vitali");

    
    model.addAttribute("nome", utente1.getNome());
    model.addAttribute("cognome", utente1.getCognome());
		
		return "greeting";
	}

}

