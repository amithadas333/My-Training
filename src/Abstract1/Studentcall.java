package Abstract1;

public class Studentcall extends StudentDetails
{
	public void studentDetails()
	{
		System.out.println("Student name is amitha");
	}

	public static void main(String[] args)
	{
		Studentcall obj=new Studentcall();
		obj.studentDetails();
		obj.roll(29);
		
		
	}

}
