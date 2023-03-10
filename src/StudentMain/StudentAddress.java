package StudentMain;

import Student.StudentDetails;

public class StudentAddress 
{
	String address="HappyHome";
	public void displayAddress()
	{
		System.out.println("My address is: " +address);
	}

	public static void main(String[] args) 
	{
		StudentAddress obj=new StudentAddress();
		obj.displayAddress();
		StudentDetails obj1=new StudentDetails();
		obj1.display();
	}

}
