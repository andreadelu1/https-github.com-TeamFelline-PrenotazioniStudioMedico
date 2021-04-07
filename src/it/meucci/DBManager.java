package it.meucci;

import java.util.*;
import java.sql.*;


public class DBManager {
	
	private Connection connessione;
	private Statement query;
	private ResultSet rs;
	private ResultSet rs1;
	private Statement up;
	private String urlDB="";
	private String userDB;
	private String pwdDB;
	
	public DBManager() throws Exception
	{
		//
		urlDB="jdbc:mysql://localhost:3306/prenotazioni?serverTimezone=UTC";
		userDB="root";
		pwdDB="";
		//Creazione della connessione
		//REgistrazione dei Driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Registrazione effettuata!");
		
		connessione=DriverManager.getConnection(urlDB, userDB, pwdDB);
		System.out.println("Connessione instaurata!");
		
		query = connessione.createStatement();
		 up = connessione.createStatement();
	}
	

	
	public boolean login(String email,String pass) throws Exception {
		
		rs=query.executeQuery("SELECT * FROM paziente WHERE email=\""+email+"\" and pass=md5(\""+pass+"\");"); 
		//System.out.println("SELECT * FROM paziente WHERE email=\""+email+"\" and pass=\"md5(\""+pass+"\")"+"\";");
		if(rs.next()==false) {
            return false;
        }
		return true;
		
	}
	
	public Paziente caricaPaziente(String email,String pass) throws Exception 
	{
		
		String sql="SELECT * FROM paziente WHERE email=\""+email+"\" and pass=md5(\""+pass+"\");";
		rs=query.executeQuery(sql);
		Paziente p = new Paziente();
		
		while(rs.next())
		{
			p=new Paziente(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
                    rs.getString(8),rs.getString(9),rs.getString(10)); 
			
		}
		
		
		return p;
	}
	
	public boolean login2(String email,String pass) throws Exception {
		
		rs=query.executeQuery("SELECT * FROM medico WHERE email=\""+email+"\" and pass=md5(\""+pass+"\");");
		if(rs.next()==false) {
            return false;
        }
		return true;
		
	}
	
	public Medico caricaMedico(String email,String pass) throws Exception 
	{
		
		String sql="SELECT * FROM medico WHERE email=\""+email+"\" and pass=md5(\""+pass+"\");";
		rs=query.executeQuery(sql);
		Medico m = new Medico();
		
		while(rs.next())
		{
			m=new Medico(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
                    rs.getString(8),rs.getString(9)); 
			
		}
		
		
		return m;
	}
	
	public void effettuaRegistrazione(String nome, String cognome, String dataN, String cf, String email,String indirizzo,String citta,String provincia,String nTelefono,String password)
			throws Exception {
		Statement statement = connessione.createStatement();
		String sql = "INSERT INTO paziente VALUES ('" + cf+ "','" + nome + "','" + cognome + "','" + dataN+ "','" + email + "',md5('"+password +"'),'"+nTelefono+"','"+indirizzo+ "','"+citta+"','"+provincia+"');";
		statement.executeUpdate(sql);
	}
	
	public boolean checkCF(String cf) throws Exception {
		String q = "SELECT * FROM paziente WHERE codicefiscale='" + cf + "';";
		rs = query.executeQuery(q);
		return rs.next();
	}
	
	public String reset(String email,String pass) throws Exception  {
		String ris="";
		String passw="";
		String password="";
		rs=query.executeQuery("SELECT pass FROM paziente WHERE email=\""+email+"\"  ;");
		if(rs.next()==false) {
            ris="";
       }else {
		 password=rs.getString("pass");
   		System.out.println(password);
       }
		
  		
		Statement statement = connessione.createStatement();
		String sql="update paziente set pass=md5('"+pass+"') where email='"+email+"';";
		statement.executeUpdate(sql);
		
		rs=query.executeQuery("SELECT pass FROM paziente WHERE email=\""+email+"\"  ;");
		if(rs.next()==false) {
            ris="";
       }else {
		 passw=rs.getString("pass");
   		System.out.println(passw);
       }
		
		if(passw.compareTo(password)!=0) {
			ris="La Password è stata cambiata";
		System.out.println("password cambiata");
		}else {
			ris="";
			System.out.println("password non cambiata");
		}
		return ris;
	}
	
	public ArrayList<Medico> getDoctors() throws Exception{
		
		ArrayList<Medico> elenco = new ArrayList<Medico>();
		
		String sql="SELECT * FROM medico order by 1;";
		rs=query.executeQuery(sql);
		Medico m;
		
		while(rs.next())
		{
			m=new Medico(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
                    rs.getString(8),rs.getString(9)); 
			elenco.add(m);
		}
		
		System.out.println("MEDICI CARICATI: " + elenco.size());
		
		return elenco;
	}
	
	public ArrayList<Specializzazione> getSpecializzazione() throws Exception{
		
		ArrayList<Specializzazione> elenco = new ArrayList<Specializzazione>();
		
		String sql="SELECT * FROM specializzazione order by 1;";
		rs=query.executeQuery(sql);
		Specializzazione s;
		
		while(rs.next())
		{
			s=new Specializzazione(rs.getString(1),rs.getString(2),rs.getString(3)); 
			elenco.add(s);
		}
		
		System.out.println("SPECIALIZZAZIONI CARICATE: " + elenco.size());
		
		return elenco;
	}
	
	
	
	
	public void close() throws Exception {
		query.close();
		connessione.close();
	}
	
	
	

	public static void main(String[] args) throws Exception {
		
		
	}

}
