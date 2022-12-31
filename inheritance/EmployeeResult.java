package inheritance;

public class EmployeeResult extends Member
{
	String specialization,department;
	public void employeeDetails(String specialization,String department)
	{
		super.details("Amitha",24,267475,6000,"Happy Home");
		System.out.println("Name of the employee is "+name);
		System.out.println("Age of the employee is "+age);
		System.out.println("Phone number of the employee is "+phone);
		System.out.println("Salary of the employee is "+salary);
		System.out.println("Address of the employee is "+address);
		System.out.println("specialization of the employee is "+specialization);
		System.out.println("department of the employee is "+department);

	}
}
