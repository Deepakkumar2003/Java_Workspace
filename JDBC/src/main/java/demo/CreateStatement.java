package demo;

import java.sql.*;

public class CreateStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st= con.createStatement();
		
		st.execute("create database college2");
		System.out.println(" database create successfully");
		


}
}
