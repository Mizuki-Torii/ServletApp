package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import scopedata.Account;

public class selectDAO {
	public List< Account > findALL(){
		List< Account > dlist = new ArrayList< Account >();
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			 con = DriverManager.getConnection(
						"jdbc:h2:tcp://localhost/~/test", "sa", "longh2132109e");
				String sql = "select * from account order by id asc";

				PreparedStatement pstmt = con.prepareStatement(sql);

				ResultSet rs = pstmt.executeQuery();
				while( rs.next() ) {
					String id = rs.getString("id");
					String pass = rs.getString("pass");
					String name = rs.getString( "name" );
					String mail = rs.getString( "mail" );
					int    age  = rs.getInt( "age" );
					String    tel  = rs.getString( "tel" );

					Account account = new Account( id , pass , name , mail , age , tel );
					dlist.add( account );
				}
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
		 return dlist;
	}
	public Account find( String wid ) {
		Account account = null;
		Connection con = null;
		try {
			Class.forName("org.h2.Driver");
			 con = DriverManager.getConnection(
						"jdbc:h2:tcp://localhost/~/test", "sa", "mizuki0628");
				String sql = "select * from account where id = ?";

				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString( 1 , wid );

				ResultSet rs = pstmt.executeQuery();
				rs.next();
				String id = rs.getString("id");
				String pass = rs.getString("pass");
				String name = rs.getString( "name" );
				String mail = rs.getString( "mail" );
				int    age  = rs.getInt( "age" );
				String   tel  = rs.getString( "tel" );
				account = new Account( id , pass , name , mail , age ,tel );

			} catch( Exception e ) {
				System.out.println( "exception error!" );
			}finally{
				try {
					if( con != null )
						con.close();
				}catch ( SQLException e ) {
					System.out.println( "SQL error!" );
					return null;
				}
		 }
		 return account;
	}
}
