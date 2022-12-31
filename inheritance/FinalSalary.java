package inheritance;

public class FinalSalary 
{
	public static void main(String[] args) 
	{
		System.out.println("Employee salary details");
		Employee obj=new Employee();
		obj.CalculateSalary(5000,200,789);
		obj.CalculateBonus();
		System.out.println("Mananger salary details");
		Manager obj1=new Manager();
		obj1.CalculateSalary(8000,300,200);
		obj1.CalculateBonus();
		System.out.println("Accountant salary details");
		Accountant obj2=new Accountant();
		obj2.CalculateSalary(9000,300,200);
		obj2.CalculateBonus();

		}

}
