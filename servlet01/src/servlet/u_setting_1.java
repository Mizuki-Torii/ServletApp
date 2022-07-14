package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.selectDAO;
import scopedata.Account;

@WebServlet("/u_setting_1")
public class u_setting_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher( "WEB-INF/jsp/u_setting_1.jsp" );
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		String path = null;

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		int age = Integer.parseInt(request.getParameter("age"));
		int tel = Integer.parseInt(request.getParameter("tel"));

		HttpSession session = request.getSession();
		Account account = new Account( id , pass, name, mail, age, tel );
		session.setAttribute("LoginUser", account);

		String value = request.getParameter("value");

		selectDAO f = new selectDAO();
		Account account1 = f.find( value );

		if( value.equals("u_setting_modify_1")) {
			path = "WEB-INF/jsp/u_setting_modify_1.jsp";
		}else if(value.equals("u_menu")) {
			path = "u_menu.jsp";
		}
	RequestDispatcher dispatcher =
			request.getRequestDispatcher( path );
	dispatcher.forward( request , response );
	}
}
