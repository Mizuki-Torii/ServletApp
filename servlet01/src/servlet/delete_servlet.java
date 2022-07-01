package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.deleteDAO;
import DAO.selectDAO;
import scopedata.Account;

@WebServlet("/delete_servlet")
public class delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if( !action.equals("go")) {
			selectDAO f = new selectDAO();
			Account account = f.find( action );
			if( account == null )
				path = "execErr.jsp";
			else {
				HttpSession session = request.getSession();
				session.setAttribute( "account" , account );
				path = "WEB-INF/jsp/deleteConfirm.jsp";
			}
		} else {
			HttpSession session = request.getSession();
			Account account = (Account)session.getAttribute("account");
			deleteDAO d = new deleteDAO();
			int r = d.AccountDelete(account.getId());

			if( r == 0 )
				path = "WEB-INF/jsp/execErr.jsp";
			else
				path = "WEB-INF/jsp/deleteDone.jsp";
	}
	RequestDispatcher dispatcher =
			request.getRequestDispatcher( path );
	dispatcher.forward( request , response );
	}
}
