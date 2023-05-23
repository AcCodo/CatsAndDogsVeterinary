package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.models.Medico;
import com.catsanddogs.agendamentos.repositories.EspecialidadeRepository;
import com.catsanddogs.agendamentos.repositories.MedicosRepository;

import jakarta.validation.Valid;

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
	
	@GetMapping("/criar")
	public ModelAndView getCriar() {
		ModelAndView model = new ModelAndView("medicos/medicos/criar");
		model.addObject("especialidades", espRep.findAll());
		return model;
	}
	
	@PostMapping("/criar")
	public String postCriar(@ModelAttribute("medico") Medico medico) {
		medRep.save(medico);
		return "redirect:/medicos";
	}
	
	@GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id")Long id) {
		medRep.deleteById(id);
        return "redirect:/medicos";
    }
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarGet(@PathVariable("id") Long id) {
		ModelAndView model = new ModelAndView("medicos/medicos/editar");
		Medico medico = medRep.findById(id).orElse(null);
		model.addObject("medico", medico);
		model.addObject("especialidades", espRep.findAll());
		return model;
	}
	
	@PostMapping("/editar/{id}")
	public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("viagem") Medico medAtualizada, BindingResult result) {
		if (result.hasErrors()) {
			return "editar";
		}
		
		Medico medExiste = medRep.findById(id).orElse(null);
		medExiste.setCrv(medAtualizada.getCrv());
		medExiste.setNome(medAtualizada.getNome());
		medExiste.setEspecialidadeId(medAtualizada.getEspecialidadeId());
		
		medRep.save(medExiste);
		
		return "redirect:/medicos";
	} 
}
