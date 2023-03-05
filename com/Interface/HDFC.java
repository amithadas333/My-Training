package com.Interface;

public class HDFC implements RBI
{

	public void deposite(long a)
	{
		double result=a*interest*duration;

		System.out.println("The amount is "+result);
		double result1=a-interest;
		System.out.println("After deposite the customer will get the amount is " +result1);
	}

	@Override
	public void recurringDepoit(double interest,double duration) 
	{
		System.out.println(+interest+duration);
	}
	public static void main(String[] args) 
	{
		HDFC obj=new HDFC();
		obj.deposite(5000);//amount in hdfc
		

	
	}

}
