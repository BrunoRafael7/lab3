import static org.junit.Assert.assertEquals;

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
	public void deveRetornarTodasAsDisciplinas(){
		System.out.println(planoDeCurso.getPeriodos().get(0).getDisciplinas().get(0).getNome());
		assertEquals("PROGRAMACAO1", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(0).getNome());
		assertEquals("LABORATORIO_DE_PROGRAMACAO1", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(1).getNome());
		assertEquals("INTRODUCAO_A_COMPUTACAO", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(2).getNome());
		assertEquals("CALCULO_DIFERENCIAL_E_INTEGRAL_I",planoDeCurso.getPeriodos().get(0).getDisciplinas().get(3).getNome());
		assertEquals("ALGEBRA_VETORIAL_E_GEOMETRIA_ANALITICA", planoDeCurso.getPeriodos().get(0).getDisciplinas().get(4).getNome());
		assertEquals("LEITURA_E_PRODUCAO_DE_TEXTOS",planoDeCurso.getPeriodos().get(0).getDisciplinas().get(5).getNome());
	}

}
