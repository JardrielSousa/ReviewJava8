package br.com.aprendendojava.generics.test;

import java.util.Scanner;

import br.com.aprendendojava.generics.service.PrintService;

public class Generics {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.println("quantos valores ?");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
		String value = sc.next();
			ps.addValue(value);
			
		}
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}
	

}
