package Aggregation2;

import Aggregation1.Addition;

public class Substraction
{
   int x=10,y=5;
   public void sub()
   {
	   System.out.println("Substraction of two numbers is: " +(x-y));
   }
	public static void main(String[] args) 
	{
		Addition obj=new Addition();
		obj.add();
		Substraction obj1=new Substraction();
		obj1.sub();

	}

}
