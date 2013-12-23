import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Disciplina;
import models.Periodo;
import models.PlanoDeCurso;

import org.junit.Before;
import org.junit.Test;



public class PlanoDeCursoTest {
	
	private PlanoDeCurso planoDeCurso;
	
	@Before
	public void start(){
		planoDeCurso = new PlanoDeCurso(); 
	}
	
	@Test
	public void deveRetornarTodasAsDisciplinasDoPrimeiroPeriodo(){
		assertEquals("Leitura_e_Produção_de_Textos", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(0).getNome());
		assertEquals("Álgebra_Vetorial_e_Geometria_Analítica", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(1).getNome());
		assertEquals("Cálculo_Diferencial_e_Integral_I", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(2).getNome());
		assertEquals("Programação_I",planoDeCurso.getPeriodos().get(0).getDisciplinas().get(3).getNome());
		assertEquals("Introdução_à_Computação", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(4).getNome());
		assertEquals("Laboratório_de_Programação_I",planoDeCurso.getPeriodos().get(0).getDisciplinas().get(5).getNome());
	}
	
	@Test
	public void deveRetornarTotalDeCreditosAtualmenteNoPeriodo(){
		assertEquals(24, planoDeCurso.getPeriodos().get(0).getTotalDeCreditos()); //TOTAL DE CRÉDITOS DO 1ª PERIODO
	}
	
	@Test
	public void deveVerificarSeEstaComQuantidadeDeCreditosPermitido(){
		List<Disciplina> disciplinas1 = planoDeCurso.getPeriodos().get(0).getDisciplinas(); //TODAS DISCIPLINAS DO 1ª PERIODO - 24 Créditos
		assertTrue(planoDeCurso.estaComQuantidadeDeCreditosPermitido(disciplinas1));
		
		
		
		List<Disciplina> disciplinas2 = new ArrayList<Disciplina>();
		Disciplina d1 =  planoDeCurso.getAllDisciplines().get(0); //Teoria_dos_Grafos - 2 Créditos
		Disciplina d2 =  planoDeCurso.getAllDisciplines().get(1); //Banco_de_Dados_II - 4 Créditos
		Disciplina d3 =  planoDeCurso.getAllDisciplines().get(2); //Projeto_em_Computação_I - 4 Créditos
		Disciplina d4 =  planoDeCurso.getAllDisciplines().get(3); //Compiladores - 4 Créditos
		Disciplina d5 =  planoDeCurso.getAllDisciplines().get(4); //Matemática_Discreta - 4 Créditos
		Disciplina d6 =  planoDeCurso.getAllDisciplines().get(5); //Optativa_10 - 4 Créditos
		Disciplina d7 =  planoDeCurso.getAllDisciplines().get(6); //Informática_e_Sociedade - 2 Créditos
		Disciplina d8 =  planoDeCurso.getAllDisciplines().get(8); //Optativa_11 - 4 Créditos
		Disciplina d9 =  planoDeCurso.getAllDisciplines().get(9); //Teoria_da_Computação - 4 Créditos
		
		//28 Créditos
		disciplinas2.add(d1);
		disciplinas2.add(d2);
		disciplinas2.add(d3);
		disciplinas2.add(d4);
		disciplinas2.add(d5);
		disciplinas2.add(d6);
		disciplinas2.add(d7);
		disciplinas2.add(d8);
		
		assertTrue(planoDeCurso.estaComQuantidadeDeCreditosPermitido(disciplinas2));
		
		//Ultrapassando os 28 Créditos (Adicionando mais 4 Créditos)
		disciplinas2.add(d9);		
		assertFalse(planoDeCurso.estaComQuantidadeDeCreditosPermitido(disciplinas2));
	}
	
	@Test
	public void deveVerificarSeOsPreRequisitosEstaoOK(){ 
		List<Periodo> primeiroPeriodo = planoDeCurso.getPeriodos();
		
		Disciplina d1 =  planoDeCurso.getAllDisciplines().get(0); //Teoria_dos_Grafos - 2 Créditos
		Disciplina d2 =  planoDeCurso.getAllDisciplines().get(1); //Banco_de_Dados_II - 4 Créditos
		Disciplina d3 =  planoDeCurso.getAllDisciplines().get(2); //Projeto_em_Computação_I - 4 Créditos
		Disciplina d4 =  planoDeCurso.getAllDisciplines().get(3); //Compiladores - 4 Créditos
		Disciplina d5 =  planoDeCurso.getAllDisciplines().get(4); //Matemática_Discreta - 4 Créditos
		Disciplina d6 =  planoDeCurso.getAllDisciplines().get(5); //Optativa_10 - 4 Créditos
		Disciplina d7 =  planoDeCurso.getAllDisciplines().get(6); //Informática_e_Sociedade - 2 Créditos
		Disciplina d8 =  planoDeCurso.getAllDisciplines().get(8); //Optativa_11 - 4 Créditos
		Disciplina d9 =  planoDeCurso.getAllDisciplines().get(9); //Teoria_da_Computação - 4 Créditos
		
		assertTrue(planoDeCurso.verificaSePreRequisitosEstaoOK(d1, primeiroPeriodo)); 

		assertFalse(planoDeCurso.verificaSePreRequisitosEstaoOK(d2, primeiroPeriodo));
		assertFalse(planoDeCurso.verificaSePreRequisitosEstaoOK(d3, primeiroPeriodo)); 
		assertFalse(planoDeCurso.verificaSePreRequisitosEstaoOK(d4, primeiroPeriodo)); 
		
		assertTrue(planoDeCurso.verificaSePreRequisitosEstaoOK(d5, primeiroPeriodo));
		assertTrue(planoDeCurso.verificaSePreRequisitosEstaoOK(d6, primeiroPeriodo));
		assertTrue(planoDeCurso.verificaSePreRequisitosEstaoOK(d7, primeiroPeriodo));
		assertTrue(planoDeCurso.verificaSePreRequisitosEstaoOK(d8, primeiroPeriodo));
		
		assertFalse(planoDeCurso.verificaSePreRequisitosEstaoOK(d9, primeiroPeriodo)); 
	}
}
