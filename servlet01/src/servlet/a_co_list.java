package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/a_co_list")
public class a_co_list extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher( "WEB-INF/jsp/a_co_list.jsp" );
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

			if( value.equals("a_co_entry_1")) {
				path = "WEB-INF/jsp/a_co_entry_1.jsp";
			}else if( value.equals("a_co_modify_1")){
				path = "WEB-INF/jsp/a_co_modify_1.jsp";
			}

	RequestDispatcher dispatcher =
			request.getRequestDispatcher( path );
	dispatcher.forward( request , response );
	}
}

