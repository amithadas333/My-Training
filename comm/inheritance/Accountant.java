package comm.inheritance;

public class Accountant extends Employee
{
	public void AccountantSalary()
	{
	super.CalculateSalary(20000,1400,1000);
	}
	public void CalculateBonus()
	{
		bonus=(basic*30)/100;
		System.out.println("Bouns salary is "+bonus);
	}
	
}
