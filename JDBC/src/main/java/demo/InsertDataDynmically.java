package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataDynmically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter id ");
		int id=sc.nextInt();
		System.out.println("enter name ");
		String name=sc.next();
		System.out.println("enter age ");
		int age=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		PreparedStatement ps=con.prepareStatement("insert into student(id,age,name(???)");
		
		ps.setInt(1,id);
		ps.setInt(2,age);
		ps.setString(3,name);
		ps.execute();
		System.out.println("data interted successfully");

	}

}
