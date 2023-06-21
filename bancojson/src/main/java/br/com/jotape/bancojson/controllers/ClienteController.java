package br.com.jotape.bancojson.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.jotape.bancojson.model.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	public String uploadClientes(@RequestParam("file") MultipartFile file) {
		try {
			byte[] bytes = file.getBytes();
			String json = new String(bytes);
			
			service.saveClienteFromJson(json);
			
			return "Arquivo JSON Carregado com sucesso!";
		}catch (IOException e) {
			return "Falha ao carregar o arquivo JSON.";
		}
	}

}
