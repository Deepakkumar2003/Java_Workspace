class Book
{
	int bid;
	String name;
	String author;
	int pages;
	double price;
	Book(nt bid, String name, String author, int pages, double price)
	{
		this.bid=bid;
		this.name=name;
		this.author=author;
		this.pages=pages;
		this.price=price;
    }
	void displayBook()
	{
		System.out.println("Book id :"+bid);
		System.out.println("Book name :"+name);
		System.out.println("Book author :"+author);
		System.out.println("Book pages:"+pages);
		System.out.println("Book price :"+price);

		System.out.println("________________________________");
	}
}
class BookCreator()
{
	java.util.Scanner scn=new java.util.Scanner(System.in);

	System.out.println("Book id :");
	int id=scn.nextInt();

	System.out.println("Book name:");
	String name=scn.next();

    System.out.println("Book author:");
	String author=scn.next();

	System.out.println("Book pages:");
	int pages=scn.nextInt();

	System.out.println("Book price:");
	double name=scn.nextDouble();

	Book book=new Book(id,name,author,pages,price);
	return book;

}

class factory2
{
	public static void main(String[] args) 
	{
		BookCreator bc=new BookCreator();
		Book b1=bc.createBook();
		Book b2=bc.createBook();
		b1.displayBook();
		b2.displayBook();
	}
}