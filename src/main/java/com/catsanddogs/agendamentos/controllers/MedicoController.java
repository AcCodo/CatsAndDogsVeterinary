package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.repositories.EspecialidadeRepository;
import com.catsanddogs.agendamentos.repositories.MedicosRepository;

@Controller
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	EspecialidadeRepository espRep;
	
	@Autowired
	MedicosRepository medRep;
	
	@GetMapping("")
	public ModelAndView menuInicial() {
		ModelAndView model = new ModelAndView("medicos/index");
		model.addObject("medicos", medRep.findAll());
		return model;
	}
	
	@GetMapping("/especialidades")
	public ModelAndView redirectEspecialidades() {
		ModelAndView model = new ModelAndView("medicos/especialidade/index");
		model.addObject("especialidades", espRep.findAll());
		return model;
	}
}
