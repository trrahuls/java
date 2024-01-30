package java_session6;

public class Calculation {
	
	int x=10;
	int y=20;
	
	void sum()  // without taking parameter
	{
		System.out.println(x+y);
	}
	
	int sum1() // without taking parameter but returning value
	{
		return (x+y);
	}
	
	void sum2(int a, int b) //  taking parameter but not returning value
	{
		System.out.println(a+b);
	}
	
	int sum3(int a, int b) //  taking parameter and returning value
	{
		return(a+b);
	}
	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		cal.sum();
		int res=cal.sum1();
		System.out.println("Result is " +res);
		cal.sum2(3, 2);
		int res1=cal.sum3(4,6);
		System.out.println("Result is " +res1);
	}
}


