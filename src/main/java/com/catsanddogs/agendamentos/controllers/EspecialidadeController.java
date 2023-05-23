package com.catsanddogs.agendamentos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.models.Especialidade;
import com.catsanddogs.agendamentos.repositories.EspecialidadeRepository;

import jakarta.validation.Valid;

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
		return "/medicos/especialidade/editar";
	}
	
	@PostMapping("/editar/{id}")
	public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("viagem") Especialidade espAtualizada, BindingResult result) {
		if (result.hasErrors()) {
			return "editar";
		}
		
		Especialidade espExiste = espRep.findById(id).orElse(null);
		espExiste.setDescricao(espAtualizada.getDescricao());
		espExiste.setDuracaoConsulta(espAtualizada.getDuracaoConsulta());
		
		espRep.save(espExiste);
		
		return "redirect:/medicos/especialidades";
	} 
	
	@GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id")Long id) {
        espRep.deleteById(id);
        return "redirect:/medicos/especialidades";
    }
	
}
