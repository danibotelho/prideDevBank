package dominio;

import static util.Validador.validaCPF;

public class Cliente {

	protected int id;
	protected String cpfCorrentista;
	protected String nomeCorrentista;
	protected String nomeSocial;
	
	public Cliente(String nome, String cpf, String nomeS) {
		validaCPF(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
		this.nomeSocial = nomeS;
	}

	public String getNome() {
//		if(true)
//			throw new RuntimeException("erro Generico");
		return nomeCorrentista;
	}

	public String getCPF() {
		return cpfCorrentista;
	}
	
	public String getNomeS() {
		return nomeSocial;
	}

	public int getId() {
		return id;
	}


	//contrutor que recebe nome e cpf
	//validar cpf
	// se cpf invalido dá erro do tipo InvalidArgument;
}