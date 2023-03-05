package com.encapsulation;

public class User 
{

	public static void main(String[] args) 
	{
		Bank obj=new Bank();
		obj.setPin(123);
		int n=obj.getPin();
		System.out.println(obj.getPin());//calling the private variable here using the set and get method
		System.out.println(n);

	}

}
