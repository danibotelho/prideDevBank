package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	
	@Test
	
	void deveCriarClientePassandoValores() {
		Cliente cliente = new Cliente("Daniela", "14785236920");
		
		String nomeCliente = cliente.getNomeCorrentista();
		String cpfCliente = cliente.getCpfCorrentista();
		
		assertEquals("Daniela",nomeCliente);
		assertEquals("14785236920",cpfCliente);
		//assertFalse(cpfCliente == "0052229996662");
		//assertTrue(cliente.getCpfCorrentista().equals("1478523692"));
	}
	
//	@Test
//	void deveValidarSeCPFContem11Caracteres() {
//		Cliente cliente = new Cliente("Daniela", "1478523692");
//		
//		String nomeCliente = cliente.getNomeCorrentista();
//		String cpfCliente = cliente.getCpfCorrentista();
//
//	}
}
