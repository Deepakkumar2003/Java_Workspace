package BatchExecutaion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

import demo.Helper;

public class BatchProcessingWithPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
         PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?)");
		
		 Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name : ");
			String name=sc.next();
			
			
			System.out.println("Enter Age : ");
			int age=sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.addBatch();
			
		}
		ps.executeBatch();
		System.out.println(" Data insert Successfull....");
	}
	
	}
