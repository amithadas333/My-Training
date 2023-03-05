package Abstract1;

abstract public class AbstractSample 
{
	int a=10,b=20;//static variable
	abstract public void add(int a,int b);//constructor
	
	public static void sub(int x,int y)
	{
		System.out.println("Substraction of two numbers is:" +(x-y));
	}
}
