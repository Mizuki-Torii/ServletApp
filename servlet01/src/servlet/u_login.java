package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import scopedata.Login;

@WebServlet("/u_login")
public class u_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher =

				request.getRequestDispatcher( "WEB-INF/jsp/u_login.jsp");
				dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path ;
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession();
		Login login = new  Login(id , pass);
		session.setAttribute("login",login);



		LoginLogic lo = new LoginLogic();
		boolean r = lo.execute(login);
		if( r == true) {	// login チェック
			path = "WEB-INF/jsp/u_menu.jsp";
		}else {
			path = "WEB-INF/jsp/loginErr.jsp";
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request,response);
	}

}
