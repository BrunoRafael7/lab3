package models;

import java.util.LinkedList;
import java.util.List;

public class Periodo {
	
	private List<Disciplina> disciplinas;
	
	public Periodo(){
		disciplinas = new LinkedList<Disciplina>();
	}
	
	public Object getDisciplinas() {
		return disciplinas;
	}

}
