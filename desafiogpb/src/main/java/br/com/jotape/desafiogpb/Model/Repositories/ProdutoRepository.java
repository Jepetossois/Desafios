package br.com.jotape.desafiogpb.Model.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.jotape.desafiogpb.Model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer>{

}
