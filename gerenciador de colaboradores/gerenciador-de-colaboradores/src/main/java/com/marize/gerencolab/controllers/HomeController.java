package com.marize.gerencolab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marize.gerencolab.models.entities.Colaborador;
import com.marize.gerencolab.models.enums.ColaboradorSetor;
import com.marize.gerencolab.models.repositories.ColaboradorRepository;

@Controller
public class HomeController {

	@Autowired
	private ColaboradorRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Colaborador> colaboradores = repository.findAll();
		model.addAttribute("colaboradores", colaboradores);
		return "home";
	}
	
	@GetMapping
	public String setor(@RequestParam String setor, Model model) {
		ColaboradorSetor colaboradorSetor = ColaboradorSetor.valueOf(setor.toUpperCase());
		List<Colaborador> colaboradores = repository.findBySetor(colaboradorSetor);
		model.addAttribute("colaboradores", colaboradores);
		return "home";
	}
}
