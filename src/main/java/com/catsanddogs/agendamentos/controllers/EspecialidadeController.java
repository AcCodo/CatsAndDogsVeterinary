package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.models.Especialidade;
import com.catsanddogs.agendamentos.repositories.EspecialidadeRepository;

@Controller
@RequestMapping("/medicos/especialidades")
public class EspecialidadeController {
	
	@Autowired
	EspecialidadeRepository espRep;
	
	@GetMapping("/criar")
	public ModelAndView criarGet() {
		ModelAndView model = new ModelAndView("medicos/especialidade/criar");
		return model;
	}
	
	@PostMapping("/criar")
	public String criarPost(@ModelAttribute("especialidade") Especialidade novaEsp) {
		espRep.save(novaEsp);
		return "redirect:/medicos/especialidades";
	}
	
	@GetMapping("/editar/{id}")
	public String editarGet(Model model, @PathVariable("id") Long id) {
		Especialidade especialidade = espRep.findById(id).orElse(null);
		model.addAttribute("especialidade", especialidade);
		return "/medicos/especialidades/editar";
	}
	
}
