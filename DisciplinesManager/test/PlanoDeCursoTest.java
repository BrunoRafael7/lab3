import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import models.Disciplina;
import models.GradeCurricular;
import models.PlanoDeCurso;

import org.junit.Before;
import org.junit.Test;


public class PlanoDeCursoTest {
	
	private PlanoDeCurso planoDeCurso;
	private GradeCurricular grade;	
	
	@Before
	public void start(){
		planoDeCurso = new PlanoDeCurso(); 
		
		grade = new GradeCurricular();
	
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
		assertEquals(24, planoDeCurso.getPeriodos().get(0).getTotalDeCreditos()); //TOTAL DO 1ª PERIODO
	}
	
	@Test
	public void abc(){
		List<Disciplina> l = new ArrayList<Disciplina>();
		Disciplina d1 = grade.get("Programação_1");
		System.out.println(d1);
		System.out.println(planoDeCurso.verificaSePreRequisitosEstaoOK(l, planoDeCurso.getPeriodos()));
		
	}

}
