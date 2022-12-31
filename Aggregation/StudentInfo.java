package Aggregation;

public class StudentInfo 
{
	String address;
	Student studentdetail;
	

	public StudentInfo(String address, Student studentdetail) 
	{
		super();
		this.address = address;
		this.studentdetail = studentdetail;
	}
	public void display()
	{
		System.out.println("Student address is "+address);
		System.out.println(studentdetail.studentname+","+studentdetail.rollnumber);
	}

	public static void main(String[] args) 
	{
		Student obj=new Student("Amitha das",5);
		Student obj1=new Student("Amal das",10);
		StudentInfo obj3=new StudentInfo("Happy home vellalloor p.o kilimanoor",obj);
		StudentInfo obj4=new StudentInfo("Mini Land kollam",obj1);
		obj3.display();
		obj4.display();
	}

}
