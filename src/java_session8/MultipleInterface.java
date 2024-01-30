package java_session8;

interface ABC 
{
	int a=100;
	void m1();
}
interface PQR 
{
	int b=200;
	void m2();
}

public class MultipleInterface implements ABC, PQR
{
	public void m1()
	{
		System.out.println("value of ABC");
	}
	
	public void m2()
	{
		System.out.println("value of PQR");
	}

	public static void main(String[] args) 
	{
		MultipleInterface mi= new MultipleInterface();
		mi.m1();
		mi.m2();

	}

}
