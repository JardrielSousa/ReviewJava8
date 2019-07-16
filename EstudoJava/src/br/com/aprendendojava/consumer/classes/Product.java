package br.com.aprendendojava.consumer.classes;

public class Product {
	private String nome;
	private double valor;
	
	public Product() {
		super();
	}

	public Product(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Product [nome=" + nome + ", valor=" + valor + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
