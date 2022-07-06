package model;

import DAO.registerDAO;
import scopedata.Account;

public class RegisterUserLogic {
	public boolean execute( Account account ) {
		registerDAO dao = new registerDAO();
		int r = dao.execute( account );
		if( r == 0 ) return false;
		return true;
	}
}
