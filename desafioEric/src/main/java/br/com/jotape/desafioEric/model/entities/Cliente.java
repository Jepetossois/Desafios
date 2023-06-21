package br.com.jotape.desafioEric.model.entities;

import java.util.Objects;

public class Cliente {
	
	public String nome;
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

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(idCliente, other.idCliente) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "ID: " + getIdCliente() + "Nome: " + getNome();
	}

}
