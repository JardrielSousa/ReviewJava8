package br.com.aprendendojava.trabalhandocomarquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CriarArquivo {

	public static void main(String[] args) {
		String path = "C:\\Users\\Jardriel Sousa\\Desktop\\out.txt";
		String[] lines = new String[] {"Line 1","Line 2" , "Deu certo","ultima line"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Arquivo Criado!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
