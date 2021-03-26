package it.meucci;

public class Medico {
	
	private String cF;
	private String nome;
	private String cognome;
	private String email;
	private String pass;
	private String indirizzo;
	private String citta;
	private String provincia;
	private String idSpec;
	
	public Medico() {
		super();
		this.cF = "";
		this.nome = "";
		this.cognome = "";
		this.email = "";
		this.pass = "";
		this.indirizzo = "";
		this.citta = "";
		this.provincia = "";
		this.idSpec = "";
	}
	public Medico(String cF, String nome, String cognome, String email, String pass, String indirizzo, String citta,
			String provincia, String idSpec) {
		super();
		this.cF = cF;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.pass = pass;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.idSpec = idSpec;
	}


	public String getcF() {
		return cF;
	}
	public void setcF(String cF) {
		this.cF = cF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getIdSpec() {
		return idSpec;
	}
	public void setIdSpec(String idSpec) {
		this.idSpec = idSpec;
	}
	
	@Override
	public String toString() {
		return "Medico [cF=" + cF + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", pass=" + pass
				+ ", indirizzo=" + indirizzo + ", citta=" + citta + ", provincia=" + provincia + ", idSpec=" + idSpec
				+ "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
