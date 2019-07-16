package br.com.aprendendojava.generics.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {	
	private List<String> list = new ArrayList<>();

	public void addValue(String value) {
		list.add(value);
	}
	public String first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");			
	}
		return list.get(0);
	}
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		System.out.print("]");
		
	}
}	