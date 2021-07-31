package executavel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaixaEletronicoTest {
	@Test
	void deveRetornaEmArrayQuantidadeDeCedulas() {
		
		int quantidadeDeNotas[] = CaixaEletronico.retirar(100);
		assertTrue(quantidadeDeNotas[0]==1);
	}
	
	@Test
	void deveSerPossivelSacar() {
		int quantidadeDeNotas[] = CaixaEletronico.retirar(150);
		assertTrue(quantidadeDeNotas[0]== 1 && quantidadeDeNotas[1]== 1);
	}
	
	

}
