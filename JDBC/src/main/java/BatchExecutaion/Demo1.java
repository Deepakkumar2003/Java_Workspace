package BatchExecutaion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			Statement st=con.createStatement();
			st.addBatch("insert into student values(4,'sunny', 23)");
			st.addBatch("insert into student values(2,'Bunny', 63)");
			st.addBatch("insert into student values(3,'hunny', 13)");
			st.addBatch("insert into student values(6,'munny', 43)");
			st.addBatch("insert into student values(5,'kunny', 53)");
			st.addBatch("update student set name='ramesh' where id=1");
			//st.addBatch("delete from student");
			int[] ar=st.executeBatch();
			System.out.println(Arrays.toString(ar));
			System.out.println("executed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
