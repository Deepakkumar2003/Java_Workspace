package demo;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		Statement st=con.createStatement();
		st.execute("create table student(id int, name varchar(20),age int)");
		System.out.println("table create successfully");
		
		
	}

}
