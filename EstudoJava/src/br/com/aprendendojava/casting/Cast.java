package br.com.aprendendojava.casting;

public class Cast {

	public static void main(String[] args) {
		double a = 2 ;
		float b ;
		
		b = (float)a;
		System.out.println("============== CAST DE DOUBLE PARA FLOAT =========================");
		System.out.println(b);
		
		double y = 2.9;
		int z = 0;
		
		z = (int)y;
		System.out.println("============== CAST DE DOUBLE PARA INT =========================");
		System.out.println(z);
		System.out.println("OBS: TEVE PERDA DE 0.9 ");
		
		
		
	}

}
