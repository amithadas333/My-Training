package com.encapsulation;

public class User1 
{

	public static void main(String[] args) 
	{
		Bank1 obj=new Bank1();
		obj.setPin(1001);
		int n=obj.getPin();
		if(n==1001||n==1234||n==1212)
		{
			System.out.println("This is a valid pin");
		}
		else
		{
			System.out.println("This is not a valid pin");
			
		
	}
		

}
}
