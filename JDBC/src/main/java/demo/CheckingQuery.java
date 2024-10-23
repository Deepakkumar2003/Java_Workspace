package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckingQuery {
public static void main(String[] args) {
	System.out.println("enter the query");
	String query=new Scanner(System.in).nextLine();
	String url="jdbc:mysql://localhost:3306/college";
	String userName="root";
	String password="root";
	try {
		Connection con=DriverManager.getConnection(url,userName,password);
		PreparedStatement ps=con.prepareStatement(query);
		boolean b =ps.execute();
		if(b) {
			System.out.println("query is select query");
		}else {
			System.out.println("query is not select query");
		}
		
		}catch(SQLException exception) {
	
}
}
}
