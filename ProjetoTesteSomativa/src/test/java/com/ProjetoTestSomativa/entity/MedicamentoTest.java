package com.ProjetoTestSomativa.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {
	
	private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		
		medicamento = new Medicamento (1L, "doril", "Contra edicado com suspeitas de dengue", "12/09/2009");
		
	}
	
	@Test
	@DisplayName("Testando o getter  e setter do campo ID")
	void test() {
		medicamento.setId(2L);
		assertEquals(2L, medicamento.getId());
	}

	@Test
	@DisplayName("Testando o getter  e setter do campo Nome")
	void testNome() {
		medicamento.setNome("doril");
		assertEquals("doril", medicamento.getNome());
	}

	@Test
	@DisplayName("Testando o getter  e setter do campo Bula")
	void testBula() {
		medicamento.setBula("Contra edicado com suspeitas de dengue");
		assertEquals("Contra edicado com suspeitas de dengue", medicamento.getBula());
	}
	@Test
	@DisplayName("Testando o getter  e setter do campo DataValidade")
	void testDatavalidade() {
		medicamento.setDatavalidade("12/09/2009");
		assertEquals("12/09/2009", medicamento.getDatavalidade());
	}
	@Test
	@DisplayName("Testando o Construtor com todos os argumentos")
	void testConstrutorAll () {
		Medicamento novoMedicamento = new Medicamento (3L, "Rivotril", "Crise de Panico", "22/07/2008");
		assertAll("novoMedicamento",
			()-> assertEquals(3L, novoMedicamento.getId()),
			()-> assertEquals("Rivotril", novoMedicamento.getNome()),
			()-> assertEquals("Crise de Panico", novoMedicamento.getBula()),
			()-> assertEquals("22/07/2008", novoMedicamento.getDatavalidade()));
	}
}

