package java_session1;

public class Day1 {

	public static void main(String[] args) {
		
		int a; // Declaring of variable
		a=10; // Initialization a variable
		int b=20;
		int c=a+b;
		
		//System.out.println("Sum of a and b is : "+c);
		
		/*Demo2.add();
		java_session2.Demo1.add();
		*/
		
		a=15;
		c=a+b;
		//System.out.println("Sum of a and b is : "+c);
		
		a=a++;//15
		//System.out.println("Value of a++ :"+a); // Post paid - Post increment
		c=a+b;
		//System.out.println("Sum of a and b is : "+c);
		
		a=++a;//16
		//System.out.println("Value of ++a :"+a); // Pre paid - Pre increment
		c=a+b; // 36
		//System.out.println("Sum of a and b is : "+c);
		
		a=--a;//15
		c=a+b; //35
		//System.out.println("Value of c is "+c); //35
		

		a=a--;//15
		c=a+b;//35
		//System.out.println("Value of c is "+c); //36
		
		a=a--;//
		a=--a;
		System.out.println("Value of c is "+a); 
		
		
	}
	


}
