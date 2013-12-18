package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeCurricular {
	private Map<String, Disciplina> disciplinas;
	
	public GradeCurricular(List<Disciplina> listaDeDisciplinas){
		disciplinas = new HashMap<String, Disciplina>();
		addDisciplinas(listaDeDisciplinas);
	}
	
	private void addDisciplinas(List<Disciplina> listaDeDisciplinas) {
		for(Disciplina dsp : listaDeDisciplinas){
			disciplinas.put(dsp.getNome(), dsp);
		}
	}
	public Disciplina get(String nome){
		return disciplinas.get(nome);
	}
}
