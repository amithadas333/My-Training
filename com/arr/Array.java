
package com.arr;
import java.util.*;

public class Array 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();//creating add
		name.add("Amitha");
		name.add("Krishna");
		name.add("Respa");
		name.add("alen");
		name.add("joshna");
		name.add("arun");
		name.add("meenu");
		name.add("sree");
		
		System.out.println("The students name in new Java batch is: "+name);
		if(name.contains("A"));//for checking the iteams are available or not using "contains" in if
		{
			System.out.println("Its avaialble");
		}
		if(name.isEmpty())//for checking the iteams are empty or not using isEmpty
		{
			System.out.println("Its empty");
		}
		else
		{
			System.out.println("Its not empty");
		}
		name.remove(1);
		name.remove("Krishna");//remove iteam from Array list and index setting
		System.out.println("After removal is "+name);
		name.set(0,"Ami");//for changing the names
		System.out.println("After setup iteam is "+name);
		Collections.sort(name);//for sorting the iteams from ascending order using Collections.sort
		System.out.println("After sorting is " +name);
		for(String fruit:name)
		{
			System.out.println(fruit);//for showing all the array list
		}
	
		

	}
}

