package java_session5;

public class SwapString {

	public static void main(String[] args) {
		
		String s1= "Rahul"; //s1=singh
		String s2= "Singh"; //s2= rahul
		
		// With using third variable
		String s;
		System.out.println("Before swapping value of string is ....");
		
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		
		s=s1; //rahul
		s1=s2; //singh
		s2=s;//singh
		
		System.out.println("After swapping value of string is ....");
		
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);

	}

}
