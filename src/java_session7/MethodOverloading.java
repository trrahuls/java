package java_session7;

public class MethodOverloading {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		MethodOverloading mo= new MethodOverloading();
		mo.add(10.0, 20);
		

	}

}
