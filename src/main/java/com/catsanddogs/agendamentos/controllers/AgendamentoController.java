package com.catsanddogs.agendamentos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.catsanddogs.agendamentos.models.Agendamento;
import com.catsanddogs.agendamentos.models.Animal;
import com.catsanddogs.agendamentos.models.Medico;
import com.catsanddogs.agendamentos.repositories.AgendamentosRepository;
import com.catsanddogs.agendamentos.repositories.AnimaisRepository;
import com.catsanddogs.agendamentos.repositories.MedicosRepository;

@Controller
@RequestMapping("/agendamentos")
public class AgendamentoController {
	
	@Autowired
	MedicosRepository medRep;
	
	@Autowired
	AnimaisRepository aniRep;
	
	@Autowired
	AgendamentosRepository ageRep;

	@GetMapping("")
	public ModelAndView menuInicial() {
		ModelAndView model = new ModelAndView("agendamentos/index");
		model.addObject("agendamentos" , ageRep.findAll());
		return model;
	}
		
	@GetMapping("/criar")
	public ModelAndView criarGet() {
		ModelAndView model = new ModelAndView("agendamentos/criar");
		List<Animal> animais = aniRep.findAll();
		List<Medico> medicos = medRep.findAll();
		model.addObject("animais", animais);
		model.addObject("medicos", medicos);
		return model;
	}
	
	@PostMapping("/criar")
	public String criarPost(@ModelAttribute("agendamento") Agendamento novoAge) {
		ageRep.save(novoAge);
		return "redirect:/agendamentos";
	}

	/*
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarGet(@PathVariable("id") Long id) {
		ModelAndView model = new ModelAndView("animais/animais/editar");
		Animal especialidade = aniRep.findById(id).orElse(null);
		model.addObject("animal", especialidade);
		List<Tutor> listT = tutRep.findAll();
		model.addObject("tutoresList", listT);
		return model;
	}
	
	@PostMapping("/editar/{id}")
	public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("viagem") Animal aniAtualizada, BindingResult result) {
		if (result.hasErrors()) {
			return "editar";
		}
		
		Animal aniExiste = aniRep.findById(id).orElse(null);
		aniExiste.setEspecie(aniAtualizada.getEspecie());
		aniExiste.setIdade(aniAtualizada.getIdade());
		aniExiste.setNome(aniAtualizada.getNome());
		aniExiste.setRaca(aniAtualizada.getRaca());
		aniExiste.setTutorId(aniAtualizada.getTutorId());
		
		aniRep.save(aniExiste);
		
		return "redirect:/animais";
	} 
	
	@GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id")Long id) {
		aniRep.deleteById(id);
        return "redirect:/animais";
    }
    
    */
	
}
