package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.repositories.TutoresRepository;

@Controller
@RequestMapping("/animais")
public class AnimalController {
	
	@Autowired
	TutoresRepository tutRep;

	@GetMapping("")
	public ModelAndView menuInicial() {
		ModelAndView model = new ModelAndView("animais/index");
		return model;
	}
	
	@GetMapping("/tutores")
	public ModelAndView redirectTutores() {
		ModelAndView model = new ModelAndView("animais/tutores/index");
		model.addObject("tutores", tutRep.findAll());
		return model;
	}
	
}
