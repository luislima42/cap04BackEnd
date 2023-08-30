package com.fatect.projeto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProjetoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void ct01_verifica_custo(){
		Produto produto = new Produto();
		produto.setCusto(12);
		assertEquals(12, produto.getCusto());
	}

}
