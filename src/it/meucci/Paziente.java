package it.meucci;

public class Paziente {
	
	private String cF;
	private String nome;
	private String cognome;
	private String dataN;
	private String email;
	private String pass;
	private String nTelefono;
	private String indirizzo;
	private String citta;
	private String provincia;
	
	public Paziente() {
		super();
		this.cF = "";
		this.nome = "";
		this.cognome = "";
		this.dataN = "";
		this.email = "";
		this.pass = "";
		this.nTelefono = "";
		this.indirizzo = "";
		this.citta = "";
		this.provincia = "";
	}
	

	public Paziente(String cF, String nome, String cognome, String dataN, String email, String pass, String nTelefono,
			String indirizzo, String citta, String provincia) {
		super();
		this.cF = cF;
		this.nome = nome;
		this.cognome = cognome;
		this.dataN = dataN;
		this.email = email;
		this.pass = pass;
		this.nTelefono = nTelefono;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
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


	public String getDataN() {
		return dataN;
	}


	public void setDataN(String dataN) {
		this.dataN = dataN;
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


	public String getnTelefono() {
		return nTelefono;
	}


	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
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

	

	@Override
	public String toString() {
		return "Paziente [cF=" + cF + ", nome=" + nome + ", cognome=" + cognome + ", dataN=" + dataN + ", email="
				+ email + ", pass=" + pass + ", nTelefono=" + nTelefono + ", indirizzo=" + indirizzo + ", citta="
				+ citta + ", provincia=" + provincia + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
