package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Get_Connection {
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product_Details", "root", "");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return connection;
	}

}
