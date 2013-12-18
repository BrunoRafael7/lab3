package models;

import java.util.List;

public class Disciplina {
	
	private String nome;
	private List<Disciplina> preRequisitos;
	private int creditos;
	private int peso;
	
	public Disciplina(String nome, List<Disciplina> preRequisitos, int creditos, int peso){
		this.nome = nome;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public List<Disciplina> getPreRequisitos() {
		return preRequisitos;
	}

	public int getCreditos() {
		return creditos;
	}

	public int getPeso() {
		return peso;
	}

}
