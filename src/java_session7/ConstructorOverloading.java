package java_session7;

public class ConstructorOverloading {

	ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(double a, int b)
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
	
		ConstructorOverloading co = new ConstructorOverloading(10,20,30);
		

	}

}
