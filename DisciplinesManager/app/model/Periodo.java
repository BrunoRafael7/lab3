package model;

import java.util.LinkedList;
import java.util.List;

public class Periodo {
	
	private List<Disciplina> disciplinas;//não faz sentido ter um atributo do tipo List<GradeCurricular>
	
	public Periodo(){
		disciplinas = new LinkedList<Disciplina>();
	}
	
	public Object getDisciplinas() {
		return disciplinas;
	}

}
