package comm.inheritance;

public class ManagerResult extends Member
{
	String specialization,department;
	public void managerDetails(String specialization,String department)
	{
		super.details("Sheeja",42,26475,9000,"Happy Home");
		System.out.println("Name of the employee is "+name);
		System.out.println("Age of the employee is "+age);
		System.out.println("Phone number of the employee is "+phone);
		System.out.println("Salary of the employee is "+salary);
		System.out.println("Address of the employee is "+address);
		System.out.println("specialization of the employee is "+specialization);
		System.out.println("department of the employee is "+department);
	}
	public static void main(String[] args) 
	{
		ManagerResult obj=new ManagerResult();
		obj.managerDetails("IT","TAX");
		EmployeeResult obj1=new EmployeeResult();
		obj1.employeeDetails("BCOM","BBA");
		obj.salaryPrint();

	}

}
