class Student   // we use static method to change static data members one for all... 
{
	int id;
	String name;
	int age;
	String gender;
	String adress;
	static String collegeName;
	static String collegeAdress;
	void add Student(int id, String name, int age, String gender, String Adress)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.adress=adress;
	}
	void displayStudent()
	{
		System.out.println("Student id" +id);
		System.out.println("Student name" +name);
		System.out.println("Student age" +age);
        System.out.println("Student gender" +gender);
		System.out.println("Student adress" +adress);
		System.out.println("Student College Name" +this.collegeName);
		System.out.println("Student college adress" +collegeAdress);
		System.out.println("***************************");
	}
	static void changecollegeName(String collegeName)
	{
		Student.collegeName=collegeName;
	}
	static void changecollegeAdress(String collegeAdress){
		Student.collegeAdress=collegeAdress;
}
}
class StudentInfo
{
	public static void main(String[] args)
{
		Student.collegeName="JSP";
		Student.collegeAdress="OAR";
		Student S1 =new Student();
		S1.addStudent(11, "chandu", 35,"male","chennai");
		S1.displayStudent();
		Student S2 =new Student();
		S2.addStudent(12, "chand", 30,"female","banglore");
		S2.displayStudent();
		Student.changecollegeName("Jspider");
		Student.changecollegeAdress("Marathahalli");
		S1.displayStudent();
		S2.displayStudent();
}
}