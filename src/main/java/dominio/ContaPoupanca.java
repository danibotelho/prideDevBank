package dominio;

<<<<<<< HEAD
public class ContaPoupanca extends Conta implements Sacavel{

	public void sacar(float valorSaque)  {

		if (valorSaque  <= this.saldo) {
			this.saldo = this.saldo - valorSaque;
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
	}
	
	public void trasferir(float valorTransferencia, Conta outraConta) {
		this.sacar(valorTransferencia);
		outraConta.depositar(valorTransferencia);
		
	}
=======
public class ContaPoupanca extends Conta {

>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d
}
