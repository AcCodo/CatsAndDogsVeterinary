package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.models.Tutor;
import com.catsanddogs.agendamentos.repositories.TutoresRepository;

@Controller
@RequestMapping("/animais/tutores")
public class TutorController {

	@Autowired
	TutoresRepository tutRep;
	
	@GetMapping("/criar")
	public ModelAndView criar() {
		ModelAndView model = new ModelAndView("animais/tutores/criar");
		return model;
	}
	
	@PostMapping("/criar")
	public String criarPost(@ModelAttribute("tutor") Tutor novoTutor) {
		tutRep.save(novoTutor);
		return "redirect:/animais/tutores";
	}
	
}
