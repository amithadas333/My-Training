package BankDetails;

import java.util.ArrayList;
import java.util.Iterator;

public class Array 
{
	public static void main(String[] args) 
	{
	ArrayList<String>al=new ArrayList<String>();
	{
     al.add("Brown");
     al.add("Green");
     al.add("Black");
     al.add("Yellow");
     System.out.println(al);
     System.out.println("I want a specific color: " +al.get(1));
     Iterator<String> i=al.iterator();
		System.out.println("The arraylist elements are:");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		al.remove(3);
		System.out.println("After removal of an third element in an array:" +al);
     
}
	}
}

	