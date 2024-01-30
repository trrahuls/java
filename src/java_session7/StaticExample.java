package java_session7;

public class StaticExample {
	
	static int a=10; //static variable
	int b=20;   //non static variable

	static void m1()  // static method
	{
		StaticExample se= new StaticExample();
		System.out.println(se.b);
		System.out.println("This is m1 - static method");
	}
	
	void m2()   // non static method
	{
		System.out.println("This is m2 - non static method");
	}
	
	void m3() // non static method
	{
		System.out.println("this si m3 -- non static method");
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		// static method can access only static stuffs
		System.out.println(StaticExample.a);
	//	StaticExample.m1();
		m1();
		
		//System.out.println(b);
		// Non static stuffs can be used in static methods : by using Object
		StaticExample se= new StaticExample();
		System.out.println(se.b);
		se.m2();
		se.m3();
		

	}

}
