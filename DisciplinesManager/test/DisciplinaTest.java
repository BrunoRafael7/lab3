import static org.junit.Assert.*;


import org.junit.Test;


public class DisciplinaTest {

	@Test
	public void testaQuantidadeDeCreditosDaDisciplina() {
		assertEquals(4, PROGRAMACAO1.getCredito());
		assertEquals(4, LABORATORIODEPROGRAMACAO1.getCredito());
	}
	
	

}
