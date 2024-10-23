package Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertAccount {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Aadhar No. ");
		int Aadhar =sc.nextInt();
		System.out.println("Enter Account No. ");
		int AccNo=sc.nextInt();
		System.out.println("Enter Name ");
		String Name=sc.next();
		System.out.println("Enter PinCode ");
		int PinCode=sc.nextInt();
		System.out.println("Enter Balance");
		double Balance=sc.nextDouble();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","root");
		PreparedStatement ps=con.prepareStatement("insert into Account(Aadhar,AccNo,Name,PinCode,Balance) values(?,?,?,?,?)");
		
		ps.setInt(1, Aadhar);
		ps.setInt(2, AccNo);
		ps.setString(3, Name);
		ps.setInt(4, PinCode);
		ps.setDouble(5, Balance);
		ps.execute();
		System.out.println(" data inserted successfully");
		

	}

}
