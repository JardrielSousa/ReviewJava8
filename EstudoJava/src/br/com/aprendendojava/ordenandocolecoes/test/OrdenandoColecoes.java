package br.com.aprendendojava.ordenandocolecoes.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoColecoes {

	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("cjava","ajardriel","bdev");
		//Collections.sort(palavras);
		System.out.println(palavras.toString());
		
		Comparator<String> comparador = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(),o2.length());
			}
			
		};
		
		Collections.sort(palavras, comparador);
		palavras.forEach(s1 ->System.out.println(s1));

}
}