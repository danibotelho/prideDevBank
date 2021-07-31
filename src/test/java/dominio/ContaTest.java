package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void deveSerPossivelCriarUmaConta() {
		//preparaçao
		//execução
		
		Conta conta = new Conta();
		//validação
		assertTrue(conta != null);
	}

	
	@Test
	void deveSerPossivelTransferirParaOutraConta(){
		//preparação
		Conta contaOrigem = new Conta();
		contaOrigem.depositar(100);  
		Conta contaDestino = new Conta();
		
		
		//execucao
		contaOrigem.trasferir(100, contaDestino);
		
		
		//validação 
		Assertions.assertTrue(contaOrigem.getSaldo() == 0);
		Assertions.assertTrue(contaDestino.getSaldo() == 100);
	}
	
	@Test
	void deveSerPossivelSacarQuandoTemosLimite() {
		//preparaçao
		Conta conta = new Conta();
		conta.depositar(1000);
		//execução
		conta.sacar(200);
		
		//validação
		assertTrue(800 == conta.getSaldo() );
	}
	
}

