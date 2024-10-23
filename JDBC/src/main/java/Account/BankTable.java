package Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","root");
		Statement st= con.createStatement();
		
		st.execute("create table Account(Aadhar int, AccNo int, Name varchar(30), PinCode int, Balance double)");
		System.out.println(" Table Account created successfully");
		
	}

}
