package com.michel.reliability.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.michel.reliability.proxy.MicroServiceMTBF;

@Controller
public class TestController {
	
	@Autowired
	MicroServiceMTBF microService;
	
	// production graphe pdf et jpg
	@GetMapping("/test1")
	public String test1() {
		
		microService.activeTest1();
		return "test2";
	}
	
	
	// accès à un graphe dans une dossier externe au projet sur serveur - aucun calcul, seulement un affichage 
	@GetMapping("/test2")
	public String test2() {
		
		return "test2";
		
	}
	
	// Production graph via script R
	@GetMapping("/test3")
	public String test3() {
		
		microService.activeTest2();
		return "test3";
	}
	
	// Génération d'une régression linéaire via script R (reg4.r) - librairie ggplot2
	@GetMapping("/reg")
	public String regression() {
		
		microService.regression();
		return "test4";
		
	}
	
	// Génération d'une régression linéaire via script R (reg2.r) - librairies par défaut
	@GetMapping("/reg3")
	public String regression3() {
		
		microService.regression3();
		return "test5";
		
	}
	
	// Récupération des coefficients d'une régression linéaire
	@GetMapping("/coef")
	public String coefficients() {
		
		microService.coefficients();
		return "test3";
		
	}
}
