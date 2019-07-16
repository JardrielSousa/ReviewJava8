package br.com.aprendendojava.interfacefuncionais.classes;

public class Cliente {
	private String nome;
	private String senha;
	private boolean status;
	private int pontos;
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, String senha, boolean status, int pontos) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.status = status;
		this.pontos = pontos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	
}
