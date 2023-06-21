package br.com.jotape.desafiogpb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jotape.desafiogpb.Model.Repositories.ProdutoRepository;
import br.com.jotape.desafiogpb.Model.entities.Produto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produto")
public class ControllerProduto {
	
	@Autowired
	private ProdutoRepository repository;
	
	@RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
	public Produto salvarProduto(@Valid Produto produto) {
		repository.save(produto);
		return produto;
	}
	

}
