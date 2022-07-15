package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import scopedata.Account;
import scopedata.Login;

public class AccountDAO {
	public Account findUserCheck( Login login) {
		Account account;
		Connection con = null;
		PreparedStatement pstmt;
		String id = login.getId();
		String pass = login.getPass();
		try {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa" , "longh2132109e");
			String sql = "select * from account where id = ? and pass = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  id);
			pstmt.setString(2,pass);

			ResultSet rs = pstmt.executeQuery();
			rs.next();		//実行結果取得
			String name = rs.getString("name");
			String mail = rs.getString("mail");
			int age = rs.getInt("age");
			int tel = rs.getInt("tel");
			account = new Account( id , pass , name , mail , age , tel);

		}catch( Exception e) {
			System.out.println(e.getMessage());
			return null;
		}finally {
			try {
				if( con != null ) con.close();
			}catch( SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		return account;
	}
}
