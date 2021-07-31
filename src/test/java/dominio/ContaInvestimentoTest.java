package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaInvestimentoTest {
	
	@Test
	void deveSerPossivelOValorDoInvestimento() {
		ContaInvestimento conta = new ContaInvestimento();
		
		conta.investir(100);
		
		Assertions.assertTrue(conta.getSaldo() == 110);
	
		
	}

}
