package models;

import java.util.LinkedList;
import java.util.List;

public class PlanoDeCurso {
	
	private List<Periodo> periodos;
	
	public PlanoDeCurso(){
		periodos = new LinkedList<Periodo>();
		/*
		 * CREATOR : Pois plano de curso guarda periodos
		 */
		periodos.add(new Periodo());
	}
	public List<Periodo> getPeriodos() {
		return periodos;
	}
	
}
