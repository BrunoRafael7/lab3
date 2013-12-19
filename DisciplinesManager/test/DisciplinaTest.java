

import static org.junit.Assert.*;
import models.ColetorDeDisciplinas;
import models.Disciplina;

import org.junit.Before;
import org.junit.Test;

public class DisciplinaTest {
	ColetorDeDisciplinas coletor;
	Disciplina calculo2;
	
	
	@Before
	public void start(){
		coletor = new ColetorDeDisciplinas();
		coletor.coletar();
		calculo2 = coletor.coletar().get(6);
		
	}
	
	@Test
	public void deveVerifiarOsPreRequisitos(){
		System.out.println(calculo2.getPreRequisitos());
		assertEquals("" , calculo2.getPreRequisitos().toString());
	}
	
	
	@Test
	public void deveVerificarQuantidadeDeCreditos(){
		
	}
	
}
