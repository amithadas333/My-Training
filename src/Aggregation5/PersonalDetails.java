package Aggregation5;

import Aggregation4.Name;

public class PersonalDetails
{
    String emailID="dasamitha255@gmail.com";
    long number=9544076238L;
    public void input()
    {
    	System.out.println("My mailid is: " +emailID);
    	System.out.println("My contact number is: " +number);
    }
	public static void main(String[] args) 
	{
		Name obj=new Name();
		obj.details();
		PersonalDetails obj1=new PersonalDetails();
		obj1.input();
		

	}

}
