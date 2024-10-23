package Collablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStoreProcedure {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
	Statement st=con.createStatement();
	st.execute("create procedure `retrievedata`()"
			+ "Begin "
			+ "select * from student ;"
			+ "End");
	System.out.println("stored procedure created successfully");
}
}
