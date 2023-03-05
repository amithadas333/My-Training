package comm.inheritance;

public class HraPf extends Salary
{
int hra,pf;
public void hrapfcalculate()
{
	int salary=super.s;
	hra=(5*salary)/100;
	pf=(20*salary)/100;
	System.out.println("Hra is " +hra);
	System.out.println("PF amount is " +pf);
	
}
}
