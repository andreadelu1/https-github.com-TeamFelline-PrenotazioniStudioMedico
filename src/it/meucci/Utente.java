package it.meucci;

public class Utente 
{
	private String email;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Utente(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Utente() {
		this.email = "";
		this.password = "";
	}
	@Override
	public String toString() {
		return "Utente [Email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
	

}
