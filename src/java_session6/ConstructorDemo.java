package java_session6;

public class ConstructorDemo {
	
	int a;
	int b;
	
	ConstructorDemo() // Default constructor
	{
		a=10;
		b=20;
	}
	
	ConstructorDemo(int x,int y) // Parametrized constructor
	{
		a=x;
		b=y;
	}
	
	void display()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cm1=new ConstructorDemo();
		cm1.display();
		
		ConstructorDemo cm2=new ConstructorDemo(100,200);
		cm2.display();
	}
}
