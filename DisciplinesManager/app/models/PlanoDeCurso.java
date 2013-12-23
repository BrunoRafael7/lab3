package models;

import java.util.LinkedList;
import java.util.List;

/*
 * CONTROLLER : Classe Plano de curso é a controladora do sistema
 */
public class PlanoDeCurso {
	private final int PRIMEIRO_PERIODO = 1;
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
	
	public PlanoDeCurso(){
		periodos = new LinkedList<Periodo>();
		gradeCurricular = new GradeCurricular();
		periodos.add(new Periodo(gradeCurricular.getAllDisciplines(PRIMEIRO_PERIODO))); 
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}
	
	public void criaProximoPeriodo(){
		periodos.add(new Periodo());
	}
	
	public void criaProximoPeriodo(List<Disciplina> disciplinas){
		periodos.add(new Periodo(disciplinas));
	}
	
	public List<Disciplina> getAllDisciplines(){
		return gradeCurricular.getAllDisciplines();
	}
	
	public boolean verificaSePreRequisitosEstaoOK(Disciplina disciplina, List<Periodo> listaPeriodos){
        int contaPreRequisitos = 0;
        List<String> preRequisito = disciplina.getPreRequisitos();
        //System.out.println("Disciplina: " + disciplina.getNome() + " Tamanho: " + preRequisito.size() + " lista: " + preRequisito.toString());
        if(!(preRequisito.isEmpty())){ //SO ENTRA SE TIVER PRE-REQUISITO
        	for(Periodo periodo : listaPeriodos){
        		for(Disciplina disciplinaPeriodo : periodo.getDisciplinas()){
        			if(preRequisito.contains(disciplinaPeriodo.getNome())){
        				contaPreRequisitos ++;
        			}
        		}
        	}
        }
        return (contaPreRequisitos == preRequisito.size());
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
	
	public boolean estaComQuantidadeDeCreditosPermitido(List<Disciplina> disciplinas){
		return (this.estaComMinimoDeCreditos(disciplinas) && this.estaComMaximoDeCreditos(disciplinas));
	}
}