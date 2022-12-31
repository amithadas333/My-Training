package exception;

public class Array 
{

	public static void main(String[] args) 
	{
		
		try {
			int arr[]=new int[5];

				arr[4]=50;
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Array is out of Bound");
		}
			System.out.println("Working");
		}
		
}
	


