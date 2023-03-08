package CustomeException;

public class Licence1 
{
	


		static int age=18;//static variable
		public static void licence()//static method
		{
			if(age<=18)
			{
				try {
					throw new LicenceException("Not eligible for voting");
				} catch (LicenceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//throw keyword
		     }
			else
			{
				System.out.println("Eligible for voting");
			}
		}

		public static void main(String[] args) throws LicenceException
		{
			Licence1.licence();//calling static method

		}

	

}
