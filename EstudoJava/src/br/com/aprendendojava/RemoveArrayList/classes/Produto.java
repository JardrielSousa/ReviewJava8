package br.com.aprendendojava.RemoveArrayList.classes;

public class Produto {
	private Long codigo;
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(Long codigo, String nome, double valor, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
		
	
}
