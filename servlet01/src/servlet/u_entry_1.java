package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.selectDAO;
import scopedata.Account;

@WebServlet("/u_entry_1")
public class u_entry_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher( "WEB-INF/jsp/u_entry_1.jsp" );
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

		selectDAO f = new selectDAO();
		Account account = f.find( value );

		if( value.equals("登録")) {
			path = "WEB-INF/jsp/u_entry_2.jsp";
		}else if(value.equals("戻る")) {
			path = "WEB-INF/jsp/u_login.jsp";
		}
	RequestDispatcher dispatcher =
			request.getRequestDispatcher( "WEB-INF/jsp/u_entry_1.jsp" );
	dispatcher.forward( request , response );
	}
}

