package Aggregation;

public class StudentDetails 
{
	int id;
	String name1;
	Print print;//object creation
	public StudentDetails(int id, String name1,Print print) 
	{
		super();
		this.id = id;
		this.name1 = name1;
		this.print=print;
	}
	public void display()
	{
		System.out.println("Student id is " +id);
		System.out.println("Student name is " +name1);
		System.out.println(print.city+","+print.name+","+print.house+","+print.pin+","+print.county);

	}
	public static void main(String args[])
	{
		Print obj=new Print("kilimanoor","amitha","happy home",6755,"india");
		Print obj1=new Print("kollam","ammu","land",6678,"kerala");
		StudentDetails obj3=new StudentDetails(45,"alka",obj);
		StudentDetails obj4=new StudentDetails(87,"athira",obj1);
		obj3.display();
		obj4.display();
		
	}
}
	
	
	
