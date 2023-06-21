package br.com.jotape.desafioEric;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jotape.desafioEric.model.entities.Cliente;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int count = 0;
		
		final File json = new File("C:\\1. João Pedro\\JP\\ws - eclipsenew\\desafioEric/cliente.json");
		final ObjectMapper OM = new ObjectMapper();
		final List<Cliente> clientes = OM.readValue(json, new TypeReference<List<Cliente>>() {});

		HashSet<Cliente> clientesImprimir = new HashSet<Cliente>();
		
		for(Cliente c: clientes) {
			if(!clientesImprimir.contains(c)) {
				System.out.println(c.getIdCliente());
				clientesImprimir.add(c);
				count++;
			}
		}
		
		System.out.println("count: " + count);
		
	}
}

