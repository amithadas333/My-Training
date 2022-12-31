package Aggregation;

public class Book 
{
	String bookname;
	int price;
	String name1;
	Author author;
	
	public Book(String bookname, int price, String name1, Author author)
	{
		super();
		this.bookname = bookname;
		this.price = price;
		this.name1 = name1;
		this.author = author;
	}
	public void display()
	{
		System.out.println("Bookname is " +name1);
		System.out.println("Book price is " +price);
		System.out.println("Author name is " +author);
		System.out.println(author.authorname+","+author.age+","+author.place);
	}

	public static void main(String[] args) 
	{
		Author obj=new Author("Dalia Lama",56,"UK");
		Author obj1=new Author("Hunter Biden",78,"Landon");
		Book obj2=new Book("The life",567,"Waman",obj);
		Book obj3=new Book("THe End",865,"Agatha",obj1);
		obj2.display();
		obj3.display();

	}

}
