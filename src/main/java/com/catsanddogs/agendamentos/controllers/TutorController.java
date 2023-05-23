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

import com.catsanddogs.agendamentos.models.Tutor;
import com.catsanddogs.agendamentos.repositories.TutoresRepository;

import jakarta.validation.Valid;

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
	
	@GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id")Long id) {
        tutRep.deleteById(id);
        return "redirect:/animais/tutores";
    }
	
	@GetMapping("/editar/{id}")
	public String editarGet(Model model, @PathVariable("id") Long id) {
		Tutor tutor = tutRep.findById(id).orElse(null);
		model.addAttribute("tutor", tutor);
		return "/animais/tutores/editar";
	}
	
	@PostMapping("/editar/{id}")
	public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("viagem") Tutor tutAtualizada, BindingResult result) {
		if (result.hasErrors()) {
			return "editar";
		}
		
		Tutor tutExiste = tutRep.findById(id).orElse(null);
		tutExiste.setBairro(tutAtualizada.getBairro());
		tutExiste.setCelular(tutAtualizada.getCelular());
		tutExiste.setCidade(tutAtualizada.getCidade());
		tutExiste.setComplemento(tutAtualizada.getComplemento());
		tutExiste.setEstado(tutAtualizada.getEstado());
		tutExiste.setLogradouro(tutAtualizada.getLogradouro());
		tutExiste.setNome(tutAtualizada.getNome());
		tutExiste.setNumero(tutAtualizada.getNumero());
		tutExiste.setTelefone(tutAtualizada.getTelefone());
		
		tutRep.save(tutExiste);
		
		return "redirect:/animais/tutores";
	} 
	
}
