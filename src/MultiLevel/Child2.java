package MultiLevel;

public class Child2 extends Child1
{
	public void division(int x,int y)
	{
		System.out.println("Division of two numbers is: " +(x/y));
	}
	public static void main(String[] args) 
	{
    	Child2 obj=new Child2();
    	obj.division(10, 5);
    	obj.sub();
    	obj.add(25, 25);
    }

}