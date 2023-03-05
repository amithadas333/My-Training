package StringNames;

public class Builder 
{

	public static void main(String[] args)
	{
		StringBuilder a=new StringBuilder("Amitha");
		a.append(" Das");//append
		System.out.println(a);
		a.insert(1,"ami");//insert
		System.out.println(a);
		a.delete(2,5);//delete
		System.out.println(a);
		a.reverse();//reverse
		System.out.println(a);
		a.replace(1,3,"Java");  
		System.out.println(a);

	}

}
