package br.com.jotape.desafioEric.model.entities;

public class Cliente {
	
	private String nome;
	private String idCliente;
	
	public Cliente() {
	
	}

	public Cliente(String nome, String idCliente) {
		super();
		this.nome = nome;
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	
	

}
