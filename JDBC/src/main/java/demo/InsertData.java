package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		Statement st=con.createStatement();
		st.execute("insert into student(id,name,age) values (1,'D', 10)" );
		st.execute("insert into student(id,name,age) values (1,'D', 10)" );
		System.out.println("data insserted successfully");
				
}
}
