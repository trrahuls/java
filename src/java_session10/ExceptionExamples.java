package java_session10;

public class ExceptionExamples {

	public static void main(String[] args) {

		System.out.println("Prog started");
		System.out.println("Prog running");

		/*	int a=100;
		int res=0;
		try {
			System.out.println(a/0); // Throws ArithmeticException
			res=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("entered into catch block");
		}
		System.out.println(res);
		 */	

		String str=null;
		try
		{
			System.out.println(str.length());
		}
		catch (NullPointerException e)
		{
			System.out.println("Entered into catch block");
		}
		System.out.println("Prog completed");
		System.out.println("Prog closed");

	}

}
