package comm.inheritance;

public class On extends Off
{
	double price;
	public void discount(double price)
	{
		price=0.4*price;
		System.out.println("The discount for ON season is "+price);
	}
	public static void main(String args[])
	{
		On obj=new On();
		obj.discount(6000);
		Off obj1=new Off();
		obj1.discount(8800);
	}
}
