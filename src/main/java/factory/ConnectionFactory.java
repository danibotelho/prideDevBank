package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		
	Connection con = DriverManager
			.getConnection("jdbc:mysql://18.208.75.123/danibotelho?useSSL=false","danibotelho","123trocar");
	
	 return con;
	}
	
}		
