package it.meucci;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResendServlet
 */
@WebServlet("/resend")
public class ResendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResendServlet() {
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
		try {
			ArrayList<String> ad=new ArrayList<String>();
			DBManager db= new DBManager();
			SendMail sm=new SendMail();
			String email=request.getParameter("txtEmail");
			String pass=request.getParameter("txtPassword");
			String pass1=request.getParameter("txtPassword1");
			
			if(db.reset(email,pass).compareTo("")!=0 && pass.compareTo(pass1)==0 ) {
				ad.add(email);
				sm.sendFromGMail(ad, "Recupero Password", db.reset(email,pass),null);
				response.sendRedirect("index.jsp");
			}else {
				
				response.sendRedirect("registrazione.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
