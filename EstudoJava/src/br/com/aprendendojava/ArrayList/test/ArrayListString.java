package br.com.aprendendojava.ArrayList.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("jardriel");
		nomes.add("lis");
		nomes.remove(1);
		//System.out.println(nomes.contains("lis"));		
		System.out.println("Itens da lista : "+nomes.toString());
		System.out.println("Lista está vazia? "+nomes.isEmpty());
		System.out.println("Quantos itens tem na lista? "+nomes.size());
		
	}
	
	
}
