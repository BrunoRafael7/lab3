import static org.junit.Assert.assertEquals;
import models.GradeCurricular;

import org.junit.Before;
import org.junit.Test;

public class GradeCurricularTest {
	static GradeCurricular grade;

	@Before
	public void setUpBeforeClass() throws Exception {
		grade = new GradeCurricular();
	}

	@Test
	public void deveConterTodasAsDisciplinas() {
		assertEquals("Leitura_e_Produção_de_Textos", grade.getAllDisciplines(1)
				.get(0).getNome());
		assertEquals("Álgebra_Vetorial_e_Geometria_Analítica", grade
				.getAllDisciplines(1).get(1).getNome());
		assertEquals("Cálculo_Diferencial_e_Integral_I", grade
				.getAllDisciplines(1).get(2).getNome());
		assertEquals("Programação_I", grade.getAllDisciplines(1).get(3)
				.getNome());
		assertEquals("Introdução_à_Computação",
				grade.getAllDisciplines(1).get(4).getNome());
		assertEquals("Laboratório_de_Programação_I", grade.getAllDisciplines(1)
				.get(5).getNome());
		assertEquals("Teoria_dos_Grafos", grade.getAllDisciplines(2)
				.get(0).getNome());
		assertEquals("Matemática_Discreta", grade.getAllDisciplines(2)
				.get(1).getNome());
		assertEquals("Fundamentos_de_Física_Clássica", grade.getAllDisciplines(2)
				.get(2).getNome());
		assertEquals("Cálculo_Diferencial_e_Integral_II", grade.getAllDisciplines(2)
				.get(3).getNome());
		assertEquals("Metodologia_Científica", grade.getAllDisciplines(2)
				.get(4).getNome());
		assertEquals("Programação_II", grade.getAllDisciplines(2)
				.get(5).getNome());
		assertEquals("Laboratório_de_Programação_II", grade.getAllDisciplines(2)
				.get(6).getNome());

	}

}
