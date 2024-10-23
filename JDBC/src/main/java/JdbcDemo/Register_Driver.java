package JdbcDemo;

public class Register_Driver {
public static void main(String[] args) throws ClassNotFoundException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("register succesfully");
	
	
}
}
