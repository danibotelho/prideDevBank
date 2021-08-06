<<<<<<< HEAD
//package dominio;
//
//
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class ContaTest {
//	
//	Conta conta ;
//	@BeforeEach
//	void inicial() {
//		conta = new Conta();
//		conta.depositar(1000);
//	}
//	
//	
//	
//	@Test
//	void deveSerPossivelCriarUmaConta() {
//		assertTrue(conta != null);
//	}
//	
//	@Test
//	void deveSerPossivelAdicionarUmaChavePix() {
//
//		//execucão
//		conta.adicionarChavePix("anaalice.cd@gmail.com");
//		//validação
//		assertTrue(conta.getChavePix(0).equals("anaalice.cd@gmail.com"));
//	}
//	@Test
//	void deveSerPossivelSacarQuandoTemosLimite() {
//
//		//execução
//		conta.sacar(200);
//		
//		//validação
//		assertTrue(800 == conta.getSaldo() );
//	}
//
//	@Test
//	void deveSerPossivelTransferirParaOutraContaQuandoTemSaldo() {
//		Conta contaDestino = new Conta();
//		contaDestino.depositar(100);
//		
//		conta.trasferir(2, contaDestino);
//		
//		assertTrue(contaDestino.getSaldo() == 102);
//	}
//	
//	
//	
//	
//}
=======
package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	void deveSerPossivelRealizarSaqueQuandoTenhoSaldo(){
		Conta conta = new Conta();
		conta.depositar(100);  
		conta.sacar(100);
		
		Assertions.assertTrue(conta.getSaldo() == 0);
	}
	
	
	@Test
	void deveSerPossivelTransferirParaOutraConta(){
		Conta contaOrigem = new Conta();
		contaOrigem.depositar(100);  
		Conta contaDestino = new Conta();
		
		contaOrigem.trasferir(100, contaDestino);
		
		Assertions.assertTrue(contaOrigem.getSaldo() == 0);
		Assertions.assertTrue(contaDestino.getSaldo() == 100);
	}
	
}
>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d
