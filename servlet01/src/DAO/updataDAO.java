package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import scopedata.Account;

public class updataDAO {
	public int AccountUpdate( Account account ) {
		int f = 0;
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			 con = DriverManager.getConnection(
						"jdbc:h2:tcp://localhost/~/test", "sa", "mizuki0628");

				String sql = "delete from account where id = ?";

				PreparedStatement pstmt = con.prepareStatement(sql);
					pstmt.setString( 1, account.getId() );
					f = pstmt.executeUpdate();
					if( f == 0 ) return 0;

					sql = "insert into account values(?,?,?,?,?,?)";
					pstmt = con.prepareStatement(sql);
					pstmt.setString( 1, account.getId() );
					pstmt.setString( 2, account.getPass() );
					pstmt.setString( 3, account.getName() );
					pstmt.setString( 4, account.getMail() );
					pstmt.setInt( 5, account.getAge() );
					pstmt.setInt( 6, account.getTel() );
					f = pstmt.executeUpdate();

			} catch( Exception e ) {
				System.out.println( e.getMessage() );
			}finally{
				try {
					if( con != null )
						con.close();
				}catch ( SQLException e ) {
					e.printStackTrace();
				}
		 }
		 return f;
	}
}