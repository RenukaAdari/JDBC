package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDB {
	static Connection con;
	public Connection getDB()
	{
	String driverclass="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/arunv";
	String username="root";
	String password="Renuka@123";
	try {
       Class. forName (driverclass);
       System.out.println("driver class found");
       con=DriverManager.getConnection(url,username,password);
       System.out.println("database connected successfully.....");
       
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return con;
	}
	
	

}
