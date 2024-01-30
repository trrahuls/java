package java_session7;

public class ThisKeyWord {
	
	int a, b; // class variable or instance variable
	
	/*void getValues(int x, int y) // method variable/ external variable
	{
		a=x;
		b=y;
		
	}
	*/
	
	void getValues(int a, int b) // method variable/ external variable
	
	// this keyword is used to use class level variable when: method level variable and class variable name is same.
	{
		this.a=a;
		this.b=a;
		
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyWord th =new ThisKeyWord();
		th.getValues(10,20);
		th.printValues();
		

	}

}
