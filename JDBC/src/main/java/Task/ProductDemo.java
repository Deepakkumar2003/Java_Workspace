package Task;

	import java.util.Scanner;

	public class ProductDemo {

		public static void main(String[] args) {
			
		}
		public static void insertData() {
			System.out.println("Enter a Id");
			Scanner sn=new Scanner(System.in);
			int id=sn.nextInt();
			System.out.println("Enter a Brand");
			String brand=sn.next();
			System.out.println("Enter a Category");
			String category=sn.next();
			System.out.println("Enter a Price");
			double price=sn.nextDouble();
			System.out.println("Enter a Stock");
			long stock=sn.nextLong();
		}
		public static void updateData() {
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter a Brand");
			String brand=sn.next();
			System.out.println("Enter a Category");
			String category=sn.next();
			System.out.println("Enter a Price");
			double price=sn.nextDouble();
			System.out.println("Enter a Stock");
			long stock=sn.nextLong();
		}
		public static void deleteData() {
				Scanner sn=new Scanner(System.in);
				System.out.println("Enter a Brand");
				String brand=sn.next();
				System.out.println("Enter a Category");
				String category=sn.next();
				System.out.println("Enter a Price");
				double price=sn.nextDouble();
				System.out.println("Enter a Stock");
				long stock=sn.nextLong();
		
			
			
		}

}