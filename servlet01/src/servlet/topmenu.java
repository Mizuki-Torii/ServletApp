package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/topmenu")
public class topmenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =

				request.getRequestDispatcher( "WEB-INF/jsp/topmenu.jsp" );

				request.getRequestDispatcher( "WEB-INF/jsp/topmenu.jsp");
		dispatcher.forward( request , response );
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");


			value = "23年卒就職活動者はコチラ";
			if( value.equals("23年卒就職活動者はコチラ")) {
				path = "WEB-INF/jsp/u_login.jsp";
			}else if( value.equals("管理者ページ")){
				path = "WEB-INF/jsp/u_login.jsp";
			}

			RequestDispatcher dispatcher =
					request.getRequestDispatcher( path );
			dispatcher.forward( request , response );
	}
}
