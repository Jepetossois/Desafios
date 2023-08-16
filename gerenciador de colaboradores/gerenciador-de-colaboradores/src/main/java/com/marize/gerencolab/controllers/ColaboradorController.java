package com.marize.gerencolab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.marize.gerencolab.models.entities.Colaborador;
import com.marize.gerencolab.models.services.ColaboradorService;

import jakarta.validation.Valid;

@Controller
public class ColaboradorController {

	@Autowired
	private ColaboradorService service;
	
	//acessa o formulario
	@GetMapping("/form")
	public String colaboradoresForm(Colaborador colaborador) {
		return "addColaboradoresForm";
	}
	
	//adiciona novo funcionario
	@PostMapping("/add")
	public String novo(@Valid Colaborador colaborador, BindingResult result) {
		if( result.hasFieldErrors()) {
			return "redirect:/form";
		}
		
		service.salvarColaborador(colaborador);
		
		return "redirect:/home";
	}
	
	//Acessa o formulario de edição
	@GetMapping("form/{id}")
	public String updateForm(Model model, @PathVariable(name = "id") int id) {
		service.atualizarForm(model, id);
		return "atualizaForm";
	}
	
	//Atualiza o colaborador
	@PostMapping("update/{id}")
	public String alterarColaborador(@Valid Colaborador colaborador, BindingResult result, @PathVariable int id) {
		if(result.hasErrors()) {
			return "redirect:/form";
		}
		service.salvarColaborador(colaborador);
		return "redirect:/home";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable(name = "id") int id, Model model) {
		service.deletar(model, id);
		return "redirect:/home";
	}
}
