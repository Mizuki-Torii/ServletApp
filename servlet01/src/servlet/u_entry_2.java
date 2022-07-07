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

@WebServlet("/u_entry_2")
public class u_entry_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		selectDAO f = new selectDAO();
		Account account = f.find( action );

		if( action.equals("touroku")) {
			path = "WEB-INF/jsp/u_entry_3.jsp";
		}else if(action.equals("modoru")) {
			path = "WEB-INF/jsp/u_entry_1.jsp";
		}
	RequestDispatcher dispatcher =
			request.getRequestDispatcher( "WEB-INF/jsp/u_entry_2.jsp" );
	dispatcher.forward( request , response );
	}
}

