package models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GradeCurricular {
	private final int PRIMEIRO_PERIODO = 1;
	private Map<String, Disciplina> disciplinas;
	
	/*
	 * CREATOR : ColetorDeDisciplinas será referenciada em GradeCurricular ,
	 * pois GradeCurricular usa muito a ColetorDeDisciplinas
	 */
	private ColetorDeDisciplinas coletorDeDisciplinas;
	
	public GradeCurricular(){
		disciplinas = new HashMap<String, Disciplina>();
		coletorDeDisciplinas = new ColetorDeDisciplinas();
		addDisciplinas(coletorDeDisciplinas.coletar());
	}
	
	private void addDisciplinas(List<Disciplina> listaDeDisciplinas) {
		for(Disciplina dsp : listaDeDisciplinas){
			disciplinas.put(dsp.getNome(), dsp);
		}
	}
	public Disciplina get(String nome){
		return disciplinas.get(nome);
	}
	
	
	public List<Disciplina> getAllDisciplines(){
		List<Disciplina> allDisciplines = new LinkedList<Disciplina>();
		for(Disciplina dsp : disciplinas.values()){
			if(dsp.getPeriodo() != PRIMEIRO_PERIODO){
				allDisciplines.add(dsp);
			}
		}
		return allDisciplines;
	}
	public List<Disciplina> getAllDisciplines(int periodo){
		List<Disciplina> allDisciplines = new LinkedList<Disciplina>();
		for(Disciplina dsp : disciplinas.values()){
			if(dsp.getPeriodo() == periodo){
				allDisciplines.add(dsp);
			}
		}
		return allDisciplines;
	}
}