package Interface;

import Interface1.InterfaceSample3;

public class InterfaceSample2 implements InterfaceSample1,InterfaceSample3
{
	  public void name()//method defining interface
	  {
		  System.out.println("My name is amitha");
	  }
	  public void roll()
	  {
		  System.out.println("My roll number is 3");
	  }
	  public static void main(String[] args) 
	  {
		  InterfaceSample2 obj=new InterfaceSample2();
		  obj.name();
		  obj.roll();
		  InterfaceSample1.name();
	}

}
