package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.selectDAO;


@WebServlet("/topmenu")
public class topmenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

			if( !action.equals("go")) {
				selectDAO f = new selectDAO();
				path = "WEB-INF/jsp/u_login.jsp";
			}else{
				path = "WEB-INF/jsp/a_login.jsp";
			}

	RequestDispatcher dispatcher =
			request.getRequestDispatcher( path );
	dispatcher.forward( request , response );
	}
}