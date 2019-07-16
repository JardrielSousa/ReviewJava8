package br.com.aprendendojava.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import br.com.aprendendojava.streams.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("jardriel","jardri07", true, 100);
		Cliente c2 = new Cliente("root","qwe123", true, 50);
		Cliente c3 = new Cliente("dev","dev123", true, 10);
		
		List<Cliente> clientes = Arrays.asList(c1,c2,c3);
		//clientes.forEach(c->System.out.println(c.getPontos()));
		List<Cliente> stream = clientes.stream().filter(c->c.getPontos()>20).collect(Collectors.toList());
		//List<Cliente> pontosMaioresVinte = stream.collect(Collectors.toList());
		//pontosMaioresVinte.forEach(c->System.out.println(c.getPontos()));
		stream.forEach(c->System.out.println(c.getPontos()));
		
	}

}
