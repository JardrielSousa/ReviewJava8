package br.com.aprendendojava.generics.service;

import java.util.Scanner;

public class PrintServiceString {

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


