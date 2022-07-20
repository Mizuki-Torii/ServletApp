package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import scopedata.Account;

@WebServlet("/u_entry_1")
public class u_entry_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		request.setCharacterEncoding("UTF-8");
		String path = null;
		String value = request.getParameter("value");
		if( value == null) {
			path = "WEB-INF/jsp/u_entry_1.jsp";
		}else {
			path = "WEB-INF/jsp/u_login.jsp";
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher( path );
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

		request.setCharacterEncoding("UTF-8");



		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		int age = Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		HttpSession session = request.getSession();
		Account account = new Account( id , pass, name, mail, age, tel );
		session.setAttribute("LoginUser", account);

//			selectDAO f = new selectDAO();
//			Account account1 = f.find( value );

	RequestDispatcher dispatcher =
			request.getRequestDispatcher( "WEB-INF/jsp/u_entry_2.jsp" );

	dispatcher.forward( request , response );
	}
}

