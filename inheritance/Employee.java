package inheritance;

public class Employee 
{
	double basic,DA,HRA,Salary;
	double bonus;
	public void CalculateSalary(double basic,double DA,double HRA)
	{
		this.basic=basic;
		this.DA=DA;
		this.HRA=HRA;
		Salary=basic+DA+HRA;
		System.out.println("The salary is "+Salary);
	}
	public void CalculateBonus()
	{
		bonus=(basic*10)/100;
		System.out.println("Bouns salary is "+bonus);
	}
}

