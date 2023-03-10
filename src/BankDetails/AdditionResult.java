package BankDetails;

public class AdditionResult extends Addition
{
	public void divisible()
	{
	  if(super.add(10,20)%10==0)
		{
		System.out.println("Divisibles by 10");
		}
	  else
	  {
		  System.out.println("Not divisible by 10");
	  }
	}
	

	public static void main(String[] args) 
	{
		AdditionResult obj=new AdditionResult();
		obj.divisible();
	}

}
