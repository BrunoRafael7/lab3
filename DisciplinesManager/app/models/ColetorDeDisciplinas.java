package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/*
 * Pure Fabrication : Pois esta classe está sendo usada para "coletar"
 * as disciplinas e ela não faz parte do contexto do mundo real.
 */
public class ColetorDeDisciplinas {
	
	private String path = "disciplinas";
	private List<Disciplina> disciplinasColetadas;
	
	public ColetorDeDisciplinas(){
		disciplinasColetadas = new LinkedList<Disciplina>();
	}
	
	public List<Disciplina> coletar(){
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(new File(path))
					)
			);
			while(reader.ready()){
				String[] line = reader.readLine().split("-");
				disciplinasColetadas.add(criarDisciplina(line));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return disciplinasColetadas;
	}

	private Disciplina criarDisciplina(String[] line) {
		
		List<String> preRequisitos = criarListaDePreRequisitos(line[0]);
		String nome = line[1];
		int creditos = Integer.parseInt(line[2]);
		int periodo = Integer.parseInt(line[3]);
		/*
		 * CREATOR : ColetorDeDisciplinas será o responsável por criar Disciplinas pois 
		 * ColetorDeDisciplinas tem as informações necessárias para a criação de uma Disciplina 
		 */
		return new Disciplina(preRequisitos, nome, creditos, periodo);
	}

	private List<String> criarListaDePreRequisitos(String line) {
		
		line.replace("[", "");
		line.replace("]", "");
		String[] nomesDosPreRequisitos = line.split(",");
		
		List<String> preRequisitos = new LinkedList<String>();
		
		for(String nome : nomesDosPreRequisitos){
			preRequisitos.add(nome);
		}
		return preRequisitos;
	}	
}