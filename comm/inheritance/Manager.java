package comm.inheritance;

public class Manager extends Employee
{
	public void Manager1()
	{
		super.CalculateSalary(6500,1200,3000);
	}
	public void CalculateBonus()
	{
		bonus=(basic*40)/100;
		System.out.println("Bouns salary is "+bonus);
	}
}
