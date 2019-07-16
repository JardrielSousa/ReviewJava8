package br.com.aprendendojava.RemoveArrayList.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.aprendendojava.RemoveArrayList.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto(1L,"teclado",100.00,2);
		Produto produto2 = new Produto(2L,"cell",1000.00,0);
		Produto produto3 = new Produto(3L,"pc",2000.00,1);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		System.out.println(produtos.size());
		/*for (Produto produto : produtos) {
			if(produto.getQuantidade() == 0) {
				System.out.println(produto);
				produtos.remove(produto);
			}
		}*/
		Iterator<Produto> produtoItarator = produtos.iterator();
		//Verifa se tem um proximo elemento
		while(produtoItarator.hasNext()) {
			//
			if (produtoItarator.next().getQuantidade() == 0) {
				produtoItarator.remove();
			}
		}
		
		System.out.println(produtos.toString());
		System.out.println(produtos.size());
	}

}
