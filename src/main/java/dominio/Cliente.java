package dominio;

import static util.Validador.validaCPF;

public class Cliente {
	protected String nomeCorrentista;
	protected String cpfCorrentista;
	
		
	public Cliente(String nomeCorrentista, String cpfCorrentista ) {
		validaCPF(cpfCorrentista);
		this.nomeCorrentista = nomeCorrentista;
		this.cpfCorrentista = cpfCorrentista;
		
	}
		
	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}


	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}


	public String getCpfCorrentista() {
		return cpfCorrentista;
	}


	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}
	
	

	
	
	
	//construtor que recebe nome e cpf 
}