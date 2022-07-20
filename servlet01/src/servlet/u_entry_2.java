package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import scopedata.Account;


@WebServlet("/u_entry_2")
public class u_entry_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

		if( value.equals("u_entry_1")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher( "WEB-INF/jsp/u_entry_1.jsp" );
			dispatcher.forward( request , response );
		}else if( value.equals("u_entry_3")){
			String path = null;
			HttpSession session = request.getSession();
			Account account = (Account)session.getAttribute("LoginUser");
			RegisterUserLogic rg = new RegisterUserLogic();
			boolean r = rg.execute(account);
			if(r == true) {
				path = "WEB-INF/jsp/u_entry_3.jsp";
			}else {
				path = "WEB-INF/jsp/u_entry_3_err.jsp";
			}
			RequestDispatcher dispatcher =
					request.getRequestDispatcher( path );
			dispatcher.forward( request , response );
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String path = null;
//
//		request.setCharacterEncoding("UTF-8");
//
//		String value = request.getParameter("value");
//
//		if( value.equals("u_entry_3")) {
////			selectDAO f = new selectDAO();
//			path = "WEB-INF/jsp/u_entry_3.jsp";
//		}else if( value.equals("u_entry_1")){
//			path = "WEB-INF/jsp/u_entry_1.jsp";
//		}
//
//	RequestDispatcher dispatcher =
//			request.getRequestDispatcher( path );
//	dispatcher.forward( request , response );
	}
}

