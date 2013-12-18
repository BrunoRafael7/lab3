package models;

import java.util.LinkedList;
import java.util.List;

public class Periodo {
	
	private List<Disciplina> disciplinas;
	/*
	 * INFORMATION EXPERT : O indice fará parte da classe 
	 * PERIODO, pois periodo é quem tem a responsabilidade 
	 * de contar quantos instâncias dela mesma já foram
	 * criadas
	 */
	public static int indice;
	
	public Periodo(){
		disciplinas = new LinkedList<Disciplina>();
		indice++;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
}