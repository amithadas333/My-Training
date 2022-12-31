package Aggregation;

public class Employee1 
{
	String empname;
	String empid;
	Car1 cal;
	Bike bike;
	
	public Employee1(String empname, String empid,Car1 cal,Bike bike) 
	{
		super();
		this.empname = empname;
		this.empid = empid;
		this.cal=cal;
		this.bike=bike;
	}

	public void display()
	{
		System.out.println("Employee name is " +empname);
		System.out.println("Employee id is " +empid);
		System.out.println(cal.color+","+cal.name+","+cal.regno);
		System.out.println(bike.bikename+","+bike.regno);
		
		
	}
	
	public static void main(String[] args) 
	{
		Car1 obj=new Car1("Black","Alto","BA2445");
		Car1 obj1=new Car1("White","Benz","BAG234");
		Bike obj2=new Bike("Bullet","BAH64");
		Bike obj3=new Bike("Scooty","BS655");
		Employee1 obj4=new Employee1("Alex","BS765",obj,obj2);
		Employee1 obj5=new Employee1("Amal","BG644",obj1,obj3);
		obj4.display();
		obj5.display();
		

	}

}
