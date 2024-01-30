package java_session5;

public class SwapVariableWithoutUsingThridVariable {

	public static void main(String[] args) {
		
		int a=10; //20
		int b=20; //10
		
		System.out.println("Without swapping the value is ");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		
		
		System.out.println("After swapping the value is ");
		
		a=b+a; //30
		b=a-b; // 30-20 =10
		a= a-b; // 30-10=20
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		
		
		

	}

}
