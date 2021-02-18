package java_tests;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int j=0;
		try
		{
			int k=i/j;
			System.out.println("Value of k: " + k);
		}
		catch (Exception e)
		{
			System.out.println("Exception caught");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Further processing");
	}

}
