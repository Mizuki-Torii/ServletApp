package model;

import DAO.AccountDAO;
import scopedata.Account;
import scopedata.Login;

public class LoginLogic {
	public boolean execute( Login login) {
		AccountDAO dao = new AccountDAO();
		Account account = dao.findUserCheck(login);
		if( account == null)	return false;
		else 					return true;
	}
}
