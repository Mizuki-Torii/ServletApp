package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/u_co_info")
public class u_co_info extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/u_co_info.jsp");
		dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if(action.equals("戻る")) {
			path = "WEB-INF/jsp/u_search.jsp";
		}else if(action.equals("ログアウト")) {
			path = "WEB-INF/jsp/u_login.jsp";
		}

	RequestDispatcher dispatcher =
			request.getRequestDispatcher("WEB-INF/jsp/u_co_info.jsp");
			request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
