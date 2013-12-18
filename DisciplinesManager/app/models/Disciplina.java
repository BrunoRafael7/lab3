package models;

import java.util.List;

import play.db.ebean.Model;

public class Disciplina extends Model{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private List<String> preRequisitos;
	private int creditos;
	
	public Disciplina(List<String> preRequisitos, String nome, int creditos){
		this.nome = nome;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
	}

	public String getNome() {
		return nome;
	}

	public List<String> getPreRequisitos() {
		return preRequisitos;
	}

	public int getCreditos() {
		return creditos;
	}
}