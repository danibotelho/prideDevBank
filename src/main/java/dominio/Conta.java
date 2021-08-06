package dominio;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	protected int id;
	String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected Cliente cliente;
	protected String chavePix[] = new String[3]; // email, cpf, telefone

	public Conta() {
		
	}	
	



	public Conta(String numeroConta, String numeroAgencia, float saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}




	public float getSaldo() {
		return saldo;

	}

	public String getChavePix(int pos) {
		return chavePix[pos];
	}

	public void adicionarChavePix(String novaChave) {

		if (chavePix[0] == null) {
			chavePix[0] = novaChave;
		} else {
			if (chavePix[1] == null) {
				chavePix[1] = novaChave;
			}else {
				chavePix[2] = novaChave;
			}
		}
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void trasferir(float valorTransferencia, Conta contaDestino) {

		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
	}

	public void sacar(float valorSaque) {
		this.saldo -= valorSaque; 

		
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public Cliente getCliente() {
		return cliente;
	}

}
