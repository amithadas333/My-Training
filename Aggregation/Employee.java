package Aggregation;

public class Employee 
{
	String name;
	String empid;
	Car car;
	
	
	public Employee(String name, String empid,Car car) 
	{
		super();
		this.name = name;
		this.empid = empid;
		this.car=car;
		
	}
	public void display()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employeeid is " +empid);
		System.out.println(car.color+","+car.carname+","+car.regno);
	}


	public static void main(String[] args) 
	{
		Car obj=new Car("Black","Alto","KA-03-HA-1877");
		Car obj1=new Car("White","Benz","KL-06-HA-1234");
		Employee obj2=new Employee("Amitha","BA123",obj);
		Employee obj3=new Employee("Amal","BA122",obj1);
		obj2.display();
		obj3.display();
		
	}

}
