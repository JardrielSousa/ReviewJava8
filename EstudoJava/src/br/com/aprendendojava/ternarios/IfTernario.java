package br.com.aprendendojava.ternarios;

public class IfTernario {

	public static void main(String[] args) {
		
		String nome = "jardri";
		
		String result = (!nome.isEmpty()) ? nome : "Nulo! Preencha os dados por favor";
		System.out.println(result);

	}

}
