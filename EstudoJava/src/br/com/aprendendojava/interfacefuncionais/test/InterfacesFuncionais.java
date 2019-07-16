package br.com.aprendendojava.interfacefuncionais.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import br.com.aprendendojava.interfacefuncionais.classes.Cliente;

public class InterfacesFuncionais {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("jardriel","qwe123", true, 100);
		Cliente c2 = new Cliente("dev","dev123", true, 50);
		
		List<Cliente> clientes = Arrays.asList(c1,c2);
		
		 Stream<Cliente> n = clientes.stream().filter(t -> t.getPontos() > 50);
		 
	}

}
