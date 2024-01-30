package java_session5;

public class SwapStringWithoutAnyThirdVariable {

	public static void main(String[] args) {
		
		String s1= "Rahul"; //s1=singh
		String s2= "Singh"; //s2= rahul
		
	
		/*System.out.println("Before swapping value of string is ....");
		
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		*/
		
		s1=s1+s2; // RahulSingh
		System.out.println("Value of concatnated string is "+s1);
		//s2="Singh";
		s2=s1.substring(0,s1.length()-s2.length()); // 0,10-5= 0,5 Rahul
		//s2=Rahul
		System.out.println("s2 is "+s2);
		System.out.println(s1.substring(s2.length()));
		s1=s1.substring(s2.length()); //s1= RahulSingh.(5)

	}

}
