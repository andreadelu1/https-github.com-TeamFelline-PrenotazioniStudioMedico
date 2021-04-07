package it.meucci;

public class Specializzazione {
	
	private String idSpec;
	private String nome;
	private String descrizione;
	
	
	

	public Specializzazione(String idSpec, String nome, String descrizione) {
		super();
		this.idSpec = idSpec;
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	public Specializzazione() {
		super();
		this.idSpec = "";
		this.nome = "";
		this.descrizione = "";
	}
	
	




	public String getIdSpec() {
		return idSpec;
	}

	public void setIdSpec(String idSpec) {
		this.idSpec = idSpec;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	

	@Override
	public String toString() {
		return "Specializzazione [idSpec=" + idSpec + ", nome=" + nome + ", descrizione=" + descrizione + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
