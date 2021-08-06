package dominio;

<<<<<<< HEAD
import Exceptions.SaldoInsufucienteException;

public class ContaCorrente extends Conta  implements Sacavel {
=======
public class ContaCorrente extends Conta{
>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d
	private float chequeEspecial = 100;
	

	@Override
	public void sacar(float valorSaque)  {
		if (valorSaque  <= this.saldo + chequeEspecial) {
			this.saldo = this.saldo - valorSaque;
		}else{
<<<<<<< HEAD
			throw new SaldoInsufucienteException("Saldo insuficiente");
		}
	}
	
	public float getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public void trasferir(float valorTransferencia, Conta outraConta) {
		this.sacar(valorTransferencia);
		outraConta.depositar(valorTransferencia);
		
	}



	
=======
			throw new RuntimeException("Saldo insuficiente");
		}
	}
>>>>>>> 2b2d05c9dbd8fd33f4e364325be2f15d9b2aea2d

	
}
