package inheritance;

public class Member 
{
String name,address;
int age,phone,salary;
public void details(String name,int age,int phone,int salary,String address)
{
	this.name=name;
	this.age=age;
	this.phone=phone;
	this.salary=salary;
	this.address=address;

}	
	public void salaryPrint()
	{
		System.out.println("Salary of the member is " +salary);
	}
}
