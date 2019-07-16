package br.com.aprendendojava.exerciciofixacaostream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import br.com.aprendendojava.exerciciofixacaostream.classes.Funcionario;

public class OrdenaPeloSalario {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("jardriel",1980.00,"jardriel.redes18@mail.com"));
		funcionarios.add(new Funcionario("mario",1980.00,"mario.bv@mail.com"));
		funcionarios.add(new Funcionario("iury",2500.00,"iury.bv@mail.com"));
		
		//Pega salario digitado pelo usuario
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor do salario:");
		Double di = ler.nextDouble();
		System.out.println("====================================================");
		
		//Verifica quem tem o salario maior que o digitado
		funcionarios.removeIf(s -> s.getSalario() <= di);
		
		//Ordena pelo email em ordem alfabetica usando comparator 
		Comparator<Funcionario> n  = (p , p2) -> p.getEmail().compareTo(p2.getEmail());
		funcionarios.sort(n);
		
		//Mostra quem atende as necessidades
		System.out.println("Cliente que atende as condições:");
		System.out.println("====================================================");
		funcionarios.forEach(a->System.out.println(a.toString()));
		/*for (Funcionario a : funcionarios) {
			System.out.println(a.toString());
		}
		*/

	}
}


