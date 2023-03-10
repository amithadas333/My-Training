package MethodOverRide;

public class OverRideParent extends OverRide
{
	@Override
	public void display()
	{
		super.display();
	System.out.println("Welcome to my Java World");

	}

	public static void main(String[] args) 
	{
		OverRideParent obj=new OverRideParent();
		obj.display();
		OverRide obj1=new OverRide();
		obj1.display();
       
	}


}
	