package Aggregation7;

import Aggregation6.StudentDetails;

public class RollNumber 
{
   public void roll(int b)
   {
	   System.out.println("Student roll number is: " +b);
   }
	public static void main(String[] args)
	{
		StudentDetails obj=new StudentDetails();
		obj.studentDetails("Amitha", 56);
		obj.studentDetails("Ann", 88);
		obj.studentDetails("Krishna", 66);
		RollNumber obj1=new RollNumber();
		obj1.roll(2);
		obj1.roll(8);
		obj1.roll(15);
	}

}
