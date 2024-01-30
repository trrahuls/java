package java_session9;

// When you create any method as final, then you can not override method in child class
	class Bike
	{
		final void run()
		{
			System.out.println("Running...............");
		}
	}
	
	class Honda extends Bike
	{
	//	void run()
		{
			System.out.println("Started.............");
		}
	}
	
	public class FinalMethodDemo 
	{
	public static void main(String[] args) {
	
		

	}

}
