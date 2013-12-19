import static org.junit.Assert.*;

import models.ColetorDeDisciplinas;
import models.Disciplina;

import org.junit.Before;
import org.junit.Test;

public class DisciplinaTest {
	ColetorDeDisciplinas coletor;
	
	Disciplina calculo2;
	Disciplina programacao2;
	Disciplina plp;
	Disciplina oac;
	
	@Before
	public void start(){
		coletor = new ColetorDeDisciplinas();
		
		calculo2 = coletor.coletar().get(6);
		programacao2 = coletor.coletar().get(9);
		plp = coletor.coletar().get(21);
		oac = coletor.coletar().get(23);	
	}
	
	@Test
	public void deveVerifiarNomeEPreRequisitos(){
		assertEquals("Cálculo_Diferencial_e_Integral_II", calculo2.getNome());
		assertEquals("[[Cálculo_Diferencial_e_Integral_I]]" , calculo2.getPreRequisitos().toString());

		assertEquals("Programação_II", programacao2.getNome());
		assertEquals("[[Programação_I, Laboratório_de_Programação_I, Introdução_à_Computação]]", programacao2.getPreRequisitos().toString());
		
		assertEquals("Paradigmas_de_Linguagens_de_Programação", plp.getNome());
		assertEquals("[[Teoria_da_Computação, Estruturas_de_Dados_e_Algoritmos, Laboratório_de_Estruturas_de_Dados_e_Algoritmos]]", plp.getPreRequisitos().toString());
		
		assertEquals("Organização_e_Arquitetura_de_Computadores_I", oac.getNome());
		assertEquals("[[Fundamentos_de_Física_Moderna, Estruturas_de_Dados_e_Algoritmos, Laboratório_de_Estruturas_de_Dados_e_Algoritmos]]", oac.getPreRequisitos().toString());
	}
	
	
	@Test
	public void deveVerificarQuantidadeDeCreditos(){
		assertEquals(4, calculo2.getCreditos());
		assertEquals(4, programacao2.getCreditos());
		assertEquals(2, plp.getCreditos());
		assertEquals(4, oac.getCreditos());
	}
}
