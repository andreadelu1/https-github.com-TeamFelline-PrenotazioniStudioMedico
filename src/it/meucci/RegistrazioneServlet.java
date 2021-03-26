package it.meucci;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrazioneServlet
 */
@WebServlet("/registrazione")
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("txtNome");
		String cognome = request.getParameter("txtCognome");
		String dataN=request.getParameter("txtDate");
		String cf=request.getParameter("txtCF");
		String email = request.getParameter("txtEmail");
		String indirizzo = request.getParameter("txtIndirizzo");
		String citta = request.getParameter("txtCitta");
		String provincia = request.getParameter("txtProvincia");
		String nTelefono = request.getParameter("txtNTelefono");
		String password = request.getParameter("txtPassword");
		String confirm_password = request.getParameter("txtPassword1");
		
		try {
			ArrayList<String> ad=new ArrayList<String>();
			SendMail sm=new SendMail();
			DBManager db = new DBManager();
			if (db.checkCF(cf) == false && (password.equals(confirm_password))) {
				db.effettuaRegistrazione(nome, cognome, dataN, cf, email, indirizzo, citta, provincia, nTelefono,password );
				ad.add(email);
				String mess="Grazie per la registrazione: "+nome;
				sm.sendFromGMail(ad, "Nuova Registrazione", mess,null);
				response.sendRedirect("index.jsp");
			} else
				response.sendRedirect("registrazione.jsp");
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
