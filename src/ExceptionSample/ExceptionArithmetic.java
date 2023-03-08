package ExceptionSample;

public class ExceptionArithmetic 
{ 
	int a=10;
    public void display()
    {
    	try 
    	{
        	System.out.println(a/0);

    	}
    	/*catch(ArithmeticException e)//
    	{
    		System.out.println("Exception handel");//
    	}
    	*/
    	finally
    	{
    		System.out.println("Welcome to java");
    	}
    	/*finally
    	{
    		System.out.println("Hello java");
    	}*/
    
    }
    
	public static void main(String[] args) 
	{
	
     ExceptionArithmetic obj=new ExceptionArithmetic();
     obj.display();
	}

}
