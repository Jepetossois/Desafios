package br.com.jotape.desafioEric;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jotape.desafioEric.model.entities.Cliente;

public class Main {
	public static void main(String[] args) throws IOException {

		File json = new File("C:\\1. João Pedro\\JP\\ws - eclipsenew\\desafioEric/cliente.json");
		ObjectMapper om = new ObjectMapper();
		JsonNode JN = om.readTree(json);
		List<Cliente> clientes = new ArrayList<Cliente>();
		HashSet<Cliente> saida = new HashSet<Cliente>();

		for (JsonNode node : JN) {
			Cliente c = new Cliente();
			
			if (node.has("nome")) {
				c = new Cliente(node.get("nome").asText(), node.get("entrada").asText());
				
			} else if (node.has("entrada")) {
				JsonNode entrada = node.get("entrada");
				c = new Cliente(entrada.get("nome").asText(), entrada.get("idCliente").asText());
				
			}
			clientes.add(c);
		}

		int count = 0;
		for (Cliente c : clientes) {
			if (!saida.contains(c)) {
				System.out.println(c.getIdCliente());
				saida.add(c);
				count++;
			}
		}

		System.out.println("Count: " + count);

	}
}
