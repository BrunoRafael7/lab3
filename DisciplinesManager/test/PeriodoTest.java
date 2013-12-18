import model.Periodo;

import org.junit.Before;
import org.junit.Test;


public class PeriodoTest {
	
	private Periodo periodo;
	@Before
	public void start(){
		periodo = new Periodo(); 
	}
	
	@Test
	public void deveRetornarTodasAsDisciplinas({
		assertEquals(Disciplinas.PROGRAMACAO1, periodo.getDisciplinas().get(0));
		assertEquals(Disciplinas.LABORATORIO_DE_PROGRAMACAO1, periodo.getDisciplinas().get(1));
		assertEquals(Disciplinas.INTRODUCAO_A_COMPUTACAO, periodo.getDisciplinas().get(2));
		assertEquals(Disciplinas.CALCULO_DIFERENCIAL_E_INTEGRALI, periodo.getDisciplinas().get(3));
		assertEquals(Disciplinas.ALGEBRA_VETORIAL_E_GEOMETRIA_ANALITICA, periodo.getDisciplinas().get(4));
		assertEquals(Disciplinas.LEITURA_E_PRODUCAO_DE_TEXTOS, periodo.getDisciplinas().get(5));
	}

}
