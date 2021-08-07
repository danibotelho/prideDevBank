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

	
	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}

	
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	//contrutor que recebe nome e cpf
	//validar cpf
	// se cpf invalido dá erro do tipo InvalidArgument;
}