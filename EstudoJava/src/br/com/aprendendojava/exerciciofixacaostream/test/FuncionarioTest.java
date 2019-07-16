package br.com.aprendendojava.exerciciofixacaostream.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FuncionarioTest {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Jardriel Sousa\\Desktop\\teste.csv");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {		
			String line = br.readLine();			
			while(line != null ) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
