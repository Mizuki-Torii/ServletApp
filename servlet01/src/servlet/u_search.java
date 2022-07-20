package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/u_search")
public class u_search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/u_search.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");

		if( value.equals("条件なしで一覧表示")) {
			path = "WEB-INF/jsp/a_co_list.jsp";
		} else if (value.equals("検索")) {
			path = "WEB-INF/jsp/u_search.jsp";
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

}
