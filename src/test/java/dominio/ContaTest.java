package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void deveSerPossivelCriarUmaConta() {
		//prepara�ao
		//execu��o
		
		Conta conta = new Conta();
		//valida��o
		assertTrue(conta != null);
	}

	
	@Test
	void deveSerPossivelTransferirParaOutraConta(){
		//prepara��o
		Conta contaOrigem = new Conta();
		contaOrigem.depositar(100);  
		Conta contaDestino = new Conta();
		
		
		//execucao
		contaOrigem.trasferir(100, contaDestino);
		
		
		//valida��o 
		Assertions.assertTrue(contaOrigem.getSaldo() == 0);
		Assertions.assertTrue(contaDestino.getSaldo() == 100);
	}
	
	@Test
	void deveSerPossivelSacarQuandoTemosLimite() {
		//prepara�ao
		Conta conta = new Conta();
		conta.depositar(1000);
		//execu��o
		conta.sacar(200);
		
		//valida��o
		assertTrue(800 == conta.getSaldo() );
	}
	
}

