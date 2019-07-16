package br.com.aprendendojava.comparator.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.aprendendojava.comparator.classes.Product;

public class ProductList {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("tv", 2000.00));
		list.add(new Product("cell", 1000.00));
		list.add(new Product("bola", 50.00));
		
		//Forma reduzida de uma função anonima usando lambda
		//list.sort((primeiroProduto , segundoProduto) -> primeiroProduto.getNome().toUpperCase().compareTo(segundoProduto.getNome().toUpperCase()));
		//Instancia de produto , pegando lambda e usando o comparator
		Comparator<Product> comp = (primeiroProduto , segundoProduto) -> 
			primeiroProduto.getNome().toUpperCase().compareTo(segundoProduto.getNome().toUpperCase());
		//Ordenando em um sort
		list.sort(comp);
		
		for (Product product : list) {
			System.out.println(product);
		}
		
	}

}
