package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetDataDynamimicaly {
	public static void main(String[] args){
		
		System.out.println("Enter the id");
		int id =new Scanner(System.in).nextInt();
		String url="jdbc:mysql://localhost:3306/college";
				String userName="root";
				String password="root";
				String query ="select*from student where id=?";
				
				try {
					Connection con=DriverManager.getConnection(url,userName,password);
					PreparedStatement ps=con.prepareStatement(query);
					ps.setInt(1, id);
					ResultSet Set=ps.executeQuery();
							if(Set.next()) {
								System.out.println("Student id is "+Set.getInt(1));
								System.out.println("Student name is "+Set.getString(2));
								System.out.println("Student age is "+Set.getInt(3));
								
							}else {
								System.out.println("There is no data with the given id");
							}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

}
}