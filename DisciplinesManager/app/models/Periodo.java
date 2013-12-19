package models;

import java.util.LinkedList;
import java.util.List;

public class Periodo {
	private final int MINIMO_DE_CREDITOS = 12;
	private final int MAXIMO_DE_CREDITOS = 28;
	private List<Disciplina> disciplinas;
	/*
	 * INFORMATION EXPERT : A classe Periodo deve ter a responsabilidade 
	 * de somar o total de créditos das disciplinas por ter as disciplinas no qual serão
	 * calculados os totais de créditos
	 */
	private int totalDeCreditos;
	
	public Periodo(){
		disciplinas = new LinkedList<Disciplina>();
	}
	
	public Periodo(List<Disciplina> disciplinas){
		this.disciplinas = disciplinas;
		for(Disciplina dsp : disciplinas){
			totalDeCreditos += dsp.getCreditos();
		}
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public int getTotalDeCreditos() {
		return totalDeCreditos;
	}
	
	/*
	 * INFORMATION EXPERT
	 * @return
	 */
	private int numeroDeCreditosValido(){
		if(this.getTotalDeCreditos() < MINIMO_DE_CREDITOS){
			return -1;
		}else if(this.getTotalDeCreditos() > MAXIMO_DE_CREDITOS){
			return 1;
		}else{
			return 0;
		}
	}
}