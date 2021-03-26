package it.meucci;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		Utente user;
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		Paziente p;
		Medico m;
		System.out.println("LoginServlet");
		try {
			DBManager db = new DBManager();
			
			if (db.login(email, password))
			{
				//UTENTE IN SESSIONE
				p=db.caricaPaziente(email, password);
				request.getSession().setAttribute("SESSION_PAZIENTE", p);
			
				response.sendRedirect("home.jsp");
			}
			else if(db.login2(email, password)) {
				m=db.caricaMedico(email, password);
				request.getSession().setAttribute("SESSION_MEDICO", m);
			
				response.sendRedirect("home2.jsp");
			}else {
				response.sendRedirect("index.jsp");
				System.out.println("Utente non registrato");
			}
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
