package inheritance;

public class Child 
{
	public void ChildClass()
	{
		System.out.println("This is child class ");
	}

	public static void main(String[] args) 
	{
		Parent obj=new Parent();
		Child obj1=new Child();
		obj.ParentClass();
		obj1.ChildClass();
		obj.ParentClass();
	}

}
