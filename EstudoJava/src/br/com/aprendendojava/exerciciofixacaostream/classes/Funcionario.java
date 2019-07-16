package br.com.aprendendojava.exerciciofixacaostream.classes;

public class Funcionario {
	private String nome ;
	private double salario;
	private String email;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, double salario, String email) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", email=" + email + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
}
