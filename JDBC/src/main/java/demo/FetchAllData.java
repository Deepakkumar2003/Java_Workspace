package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FetchAllData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=Helper.getConnect();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select  * from student");
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		System.out.println("==========================================");
	}
	
	
			

	}

}
