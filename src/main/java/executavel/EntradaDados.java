package executavel;

<<<<<<< HEAD
import java.util.Scanner;

import Exceptions.SaldoInsufucienteException;
import dominio.Cliente;
import dominio.Conta;
import dominio.ContaCorrente;
=======
import dominio.Conta;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;
>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d

public class EntradaDados {

	public static void main(String[] args) {
<<<<<<< HEAD

		String gatinhosDaTv[] = { "Mel Gibson", "Deniro", "Fagundes", "Caio Castro" ,"Matheus Solano"};
		
		int i = 0;
		while(i < gatinhosDaTv.length) {
			System.out.println(gatinhosDaTv[i]);
			i++;
		}
		

		for (int contador = 0; contador < gatinhosDaTv.length ; contador++) {
			String inicial = gatinhosDaTv[contador].substring(0, 1);
			if (inicial.equals("M")) {
				System.out.println(gatinhosDaTv[contador]);
			}

		}

		for(String nome : gatinhosDaTv) {
			System.out.println(nome);
		}
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		
		while(! texto.equals("sair")) {
			System.out.println("Digite um texto:");
			texto =entrada.nextLine();
		}

=======
	
		Conta contaAna = new Conta();
		
		contaAna.setChavePix("11992188351");
		contaAna.depositar(100);
		
		ContaCorrente contaDaGi = new ContaCorrente();

		System.out.println("conta da Gi: " +contaDaGi.getSaldo());
		
		
		System.out.println("saldo " + contaAna.getSaldo());
		System.out.println("chavePix " + contaAna.getChavePix());
		System.out.println("saldo anterior "+ contaAna.getSaldo());
		
		contaAna.trasferir(10, contaDaGi);
		System.out.println("novo saldo "+ contaAna.getSaldo());
		
		System.out.println("Novo saldo Gi "+ contaDaGi.getSaldo());
>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d
	}

}
