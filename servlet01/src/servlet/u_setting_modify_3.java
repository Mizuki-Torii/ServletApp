package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.selectDAO;


@WebServlet("/u_setting_modify_3")
public class u_setting_modify_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher( "WEB-INF/jsp/u_setting_modify_3.jsp" );
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

			if( value.equals("u_menu")) {
				selectDAO f = new selectDAO();
				path = "WEB-INF/jsp/u_menu.jsp";

	RequestDispatcher dispatcher =
			request.getRequestDispatcher( path );
	dispatcher.forward( request , response );
		}
	}
}