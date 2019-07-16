package br.com.aprendendojava.comparator.classes;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product primeiroProduto, Product segundoProduto) {
		return primeiroProduto.getNome().toUpperCase().compareTo(segundoProduto.getNome().toUpperCase());
	}


}
