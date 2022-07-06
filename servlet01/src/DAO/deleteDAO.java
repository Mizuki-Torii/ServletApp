package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteDAO {
	public int AccountDelete( String id ) {
		int f = 0;
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			 con = DriverManager.getConnection(
						"jdbc:h2:tcp://localhost/~/test", "sa", "mizuki0628");
				String sql = "delete from account where id = ?";

				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString( 1 , id );

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


<!-- nguyenphihung -->