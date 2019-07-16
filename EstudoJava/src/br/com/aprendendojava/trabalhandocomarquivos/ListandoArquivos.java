package br.com.aprendendojava.trabalhandocomarquivos;

import java.io.File;
import java.util.Scanner;

public class ListandoArquivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho da pasta:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("Arquivos:");
		for (File file : files) {
			System.out.println(file);
		}

	}

}
