package Com.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	private static String url = "jdbc:mysql://localhost:3306/school";
	private static String userName = "root";//username
	private static String password = "Rash@1231";//password
	private static Connection con; 

	public static Connection getConnection() { //create connection method
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, userName, password);// call data base 
				
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("Database connection is not success!!!");//error generate
			}
			
			return con;
		}
}
