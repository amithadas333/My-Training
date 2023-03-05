package Abstract1;

public class AbstractSample1 extends AbstractSample
{
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("addition of two numbers is: " +(a+b));
		

	}
	public static void main(String[] args) 
	{
		AbstractSample1 obj=new AbstractSample1();
		obj.add(10,20);
		AbstractSample.sub(20, 10);
		obj.add(10,20);

	}

}
