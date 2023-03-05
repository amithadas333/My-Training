package com.collections;
import java.util.*;
public class Colors 
{

	public static void main(String[] args) 

	{
		ArrayList<String> color=new ArrayList<>();//adding colors using arraylist add method
		color.add("Green");
		color.add("Blue");
		color.add("Yellow");
		color.add("Black");
		color.add("White");
		color.add("Red");
		color.add("Light Blue");
		System.out.println("The colors is: " +color);
		System.out.println("The 2nd element of an array list is :" +color.get(2));//get method for getting a particular element in arraylist
		for(String name:color)

		{
		
			System.out.println(name + " ");//iterate all the elements in an array using for each loop(iterate)
		}
		Iterator<String> i=color.iterator();
		System.out.println("The arraylist elements are:");
		while(i.hasNext())
		{
			System.out.println(i.next());//iterator all the elements in an array using iterator method hasnext
		}
		color.remove(3);
		System.out.println("After removal of an third element in an array:" +color);
		if(color.contains("Red"))//Searching a particular element in an array
		{
			System.out.println("Exits in the arraylist");
		}
			else
			{
				System.out.println("Not exist in the arraylist");
			}
		}
	

}
	


