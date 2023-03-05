package comm.inheritance;
import java.util.Scanner;
public class Salary 
{
int b,s,d;
public void basic()
{
	System.out.println("The basicpay of an employee is ");
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();
	System.out.println("The bouns of an employee is ");
	b=sc.nextInt();
	System.out.println("The deduction of an employee is ");
	d=sc.nextInt();
	sc.close();
}
}
