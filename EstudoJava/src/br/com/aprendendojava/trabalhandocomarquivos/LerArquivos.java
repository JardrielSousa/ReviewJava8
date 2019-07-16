package br.com.aprendendojava.trabalhandocomarquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivos {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Jardriel Sousa\\Desktop\\teste.csv");
		/*FileReader fr = null ;
		BufferedReader br = null;*/
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			/*fr = new FileReader(file);
			br = new BufferedReader(fr);*/
			
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
