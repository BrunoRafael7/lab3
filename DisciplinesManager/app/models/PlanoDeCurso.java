package models;

import java.util.LinkedList;
import java.util.List;

/*
 * CONTROLLER : Classe Plano de curso é a controladora do sistema
 */
public class PlanoDeCurso {
	
	private List<Periodo> periodos;
	
	/*
	 * CREATOR : grade curricular será referenciada em Plano de curso,
	 * pois plano de curso usa muito a grade Curricular
	 */
	
	private GradeCurricular gradeCurricular;
	
	/*
	 * CREATOR : A criação do Periodo ficou em plano de curso
	 * Pois plano de curso guarda periodos
	 */
	public PlanoDeCurso(){
		periodos = new LinkedList<Periodo>();
		gradeCurricular = new GradeCurricular();
		periodos.add(new Periodo(gradeCurricular.getAllDisciplinas(1)));
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}
}