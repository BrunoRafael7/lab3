package models;

import java.util.LinkedList;
import java.util.List;

/*
 * CONTROLLER : Classe Plano de curso é a controladora do sistema
 */
public class PlanoDeCurso {
	private final int MINIMO_DE_CREDITOS = 12;
	private final int MAXIMO_DE_CREDITOS = 28;
	private List<Periodo> periodos;
	
	/*
	 * CREATOR : 
	 * 1 - Grade curricular será referenciada em Plano de curso,
	 * pois plano de curso usa muito a grade Curricular
	 * 2 - A criação do Periodo ficou em plano de curso
	 * Pois plano de curso guarda periodos
	 */
	
	private GradeCurricular gradeCurricular;
	private final int PRIMEIROPERIODO = 1;
	
	public PlanoDeCurso(){
		periodos = new LinkedList<Periodo>();
		gradeCurricular = new GradeCurricular();
		periodos.add(new Periodo(gradeCurricular.getAllDisciplines(PRIMEIROPERIODO))); 
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}
	
	public void criaProximoPeriodo(List<Disciplina> disciplinas){
		periodos.add(new Periodo(disciplinas));
	}
	
	public List<Disciplina> getAllDisciplines(){
		return gradeCurricular.getAllDisciplines();
	}
	
	
	public boolean verificaSePreRequisitosEstaoOK(List<Disciplina> listaDeDisciplinas, List<Periodo> listaPeriodos){
		boolean resp = false;
		
		for(Disciplina cadaDisciplinaAVerificar : listaDeDisciplinas){	
			if(cadaDisciplinaAVerificar.getPreRequisitos().size() > 0){ //So entra se discip tiver pre requisito a verificar
				List<String> listaPreRequisito = cadaDisciplinaAVerificar.getPreRequisitos();
				for(Periodo cadaPeriodo : listaPeriodos){	
					for(String cadaPreRequisito : listaPreRequisito){
						if(cadaPeriodo.getDisciplinas().contains(cadaPreRequisito)){
							resp = true;
						}else{
							return false;
						}
					}
				}
			}
		}
		return resp;
	}
	
	/*
	 * Padrão Expert
	 */
	private boolean estaComMinimoDeCreditos(List<Disciplina> disciplinas){
		boolean resp = false;
		int contaCredito = 0;
		for(Disciplina disciplina : disciplinas){
			contaCredito += disciplina.getCreditos();
		}
		if(contaCredito >= MINIMO_DE_CREDITOS){
			resp = true;
		}
		return resp;
	}
	
	/*
	 * Padrão Expert
	 */
	private boolean estaComMaximoDeCreditos(List<Disciplina> disciplinas){
		boolean resp = false;
		int contaCredito = 0;
		for(Disciplina disciplina : disciplinas){
			contaCredito += disciplina.getCreditos();
		}
		if(contaCredito <= MAXIMO_DE_CREDITOS){
			resp = true;
		}
		return resp;
	}
	
	private boolean estaComCreditosPermitido(List<Disciplina> disciplinas){
		return (this.estaComMinimoDeCreditos(disciplinas) && this.estaComMaximoDeCreditos(disciplinas));
	}
}