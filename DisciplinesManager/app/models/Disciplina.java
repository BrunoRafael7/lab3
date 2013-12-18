package models;

import java.util.List;

public class Disciplina {
	
	private String name;
	private List<Disciplina> preRequisitos;
	private int creditos;
	private int peso;
	
	public Disciplina(String name, List<Disciplina> preRequisitos, int creditos, int peso){
		this.name = name;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
		this.peso = peso;
	}

	public String getName() {
		return name;
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
