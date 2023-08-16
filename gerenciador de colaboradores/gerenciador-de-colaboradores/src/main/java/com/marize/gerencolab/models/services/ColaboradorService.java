package com.marize.gerencolab.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.marize.gerencolab.models.entities.Colaborador;
import com.marize.gerencolab.models.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {
	
	@Autowired
	private ColaboradorRepository repository;
	
	public void salvarColaborador(Colaborador colaborador) {
		repository.save(colaborador);
	}
	
	public void atualizarForm(Model model, int id) {
		Colaborador colab = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de usuario inválido: " + id));
		model.addAttribute("colaborador", colab);
	}

	public void deletar(Model model, int id) {
		Colaborador colab = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de usuario inválido: " + id));
		repository.delete(colab);
	}
}
