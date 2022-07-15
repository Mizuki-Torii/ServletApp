package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/u_menu")
public class u_menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =

				request.getRequestDispatcher( "WEB-INF/jsp/u_menu.jsp");
				dispatcher.forward( request , response );
			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		String path = null;
			request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

		if( value.equals("u_search")) {
			path = "WEB-INF/jsp/u_search.jsp";
		}else if(value.equals("u_co_list")) {
			path = "WEB-INF/jsp/u_co_list.jsp";
		}else if(value.equals("u_setting_1")) {
			path = "WEB-INF/jsp/u_setting_1.jsp";
		}else if(value.equals("u_login")) {
			path = "WEB-INF/jsp/u_login.jsp";
		}

		RequestDispatcher dispatcher =
				request.getRequestDispatcher( path );
		dispatcher.forward(request, response);
	}

}
