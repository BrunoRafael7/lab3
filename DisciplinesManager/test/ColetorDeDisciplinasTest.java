import junit.framework.Assert;
import models.ColetorDeDisciplinas;

import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class ColetorDeDisciplinasTest {
	private static ColetorDeDisciplinas disciplinas;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		disciplinas = new ColetorDeDisciplinas();
	}

	@Test
	public void deveEstarColetandoDisciplinasDoArquivo() throws Exception {
		disciplinas.coletar();

		Assert.assertEquals("Cálculo_Diferencial_e_Integral_I", disciplinas
				.getDisciplinasColetadas().get(0).getNome());
		Assert.assertEquals(4, disciplinas.getDisciplinasColetadas().get(0)
				.getCreditos());
		Assert.assertEquals(1, disciplinas.getDisciplinasColetadas().get(0)
				.getPeriodo());

	}

}
