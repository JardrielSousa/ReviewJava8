package br.com.aprendendojava.trabalhandocomarquivos;

import java.io.File;
import java.util.Scanner;

public class ListandoPastas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho da pasta:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS:");
		System.out.println("=========================");
		for (File file : folders) {
			System.out.println(file);
		}

		//pasta
		System.out.println("Digite o nome da pasta desejada");
		String pasta = sc.nextLine();
		//Cria pastas 
		boolean success = new File(strPath + "\\"+pasta).mkdir();
		System.out.println("Pasta criada com sucesso: " + success);
	}

}
