package jdbc;

import java.sql.SQLException;

public class DataBaseConnection {
    public static void main(String args[]) {
    	ConDB conn =new ConDB();
    	String query="CREATE TABLE COURSE"+"(courseID INTEGER not Null,"+"courseName VARCHAR(255),"+"courseDuration INTEGER NOT NULL,"+"courseFee INTEGER,"+"PRIMARY KEY (courseId))";
    conn.getDB();
    try {
    	java.sql.Statement stmt=ConDB.con.createStatement();
    	stmt.execute(query);
    	System.out.println("table created successfull");
    	
    }
      catch(SQLException e)
    {
    	  e.printStackTrace();
    }
}
}