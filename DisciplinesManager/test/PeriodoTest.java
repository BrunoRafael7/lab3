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
		assertEquals("PROGRAMACAO1", periodo.getDisciplinas().get(0).getName());
		assertEquals(".LABORATORIO_DE_PROGRAMACAO1", periodo.getDisciplinas().get(1));
		assertEquals("INTRODUCAO_A_COMPUTACAO", periodo.getDisciplinas().get(2));
		assertEquals("CALCULO_DIFERENCIAL_E_INTEGRALI", periodo.getDisciplinas().get(3));
		assertEquals("ALGEBRA_VETORIAL_E_GEOMETRIA_ANALITICA", periodo.getDisciplinas().get(4));
		assertEquals("LEITURA_E_PRODUCAO_DE_TEXTOS", periodo.getDisciplinas().get(5));
	}

}
