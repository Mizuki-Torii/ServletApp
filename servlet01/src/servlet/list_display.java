package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.selectDAO;
import scopedata.Account;

@WebServlet("/list_display")
public class list_display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		selectDAO d = new selectDAO();
		List< Account > dlist = d.findALL();

		request.setAttribute( "list" , dlist );
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listdisplay.jsp");
		dispatcher.forward( request, response );
	}
}
