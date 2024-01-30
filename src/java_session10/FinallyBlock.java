package java_session10;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Start");

		int a=100;

		try {
			System.out.println(a/0); // Throws ArithmeticException

		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered into catch block");
		}
		finally
		{
			System.out.println("entered into final block");
		}
		System.out.println("Prog ends");

	}

}
