package inheritance;

public class Off 
{
	double amount;
	public void discount(double amount)
	{
		amount=0.15*amount;
		System.out.println("The discount for off season is "+amount);
	}
}
