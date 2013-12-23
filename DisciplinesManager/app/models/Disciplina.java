package models;

import java.util.List;

import play.db.ebean.Model;

public class Disciplina extends Model{
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", preRequisitos=" + preRequisitos
				+ ", creditos=" + creditos + ", periodo=" + periodo + "]";
	}

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private List<String> preRequisitos;
	private int creditos;
	private int periodo;
	
	public Disciplina(List<String> preRequisitos, String nome, int creditos, int periodo){
		this.nome = nome;
		this.preRequisitos = preRequisitos;
		this.creditos = creditos;
		this.periodo = periodo;
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

	public int getPeriodo() {
		return periodo;
	}
}