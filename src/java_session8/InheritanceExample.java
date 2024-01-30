package java_session8;

class A  //Parent class
{
	int a;
	void display()
	{
		System.out.println("Value from parent class -->"+a);
	}
}
class B extends A  //Child class
{
	int b;
	void print() 

	{
		System.out.println("Value from child class -->"+b);
	}
}
class C extends B  //Child class
{
	int c;
	void show()
	{
		System.out.println("Value from grand child class -->"+c);
	}
}

public class InheritanceExample {

	public static void main(String[] args) 
	{
	
	/*	B bobj= new B();
		bobj.a=20;
		bobj.b=30;
		
		bobj.display();
		bobj.print();
		*/
		
		/*C cobj= new C();
		
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.print();
		cobj.show();
		*/
		
		
	}

}
