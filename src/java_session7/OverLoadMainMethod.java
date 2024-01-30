package java_session7;

public class OverLoadMainMethod {

	
	
	public void main(int a)
	{
		System.out.println(a);
	}
	
	public void main(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		OverLoadMainMethod olm=new OverLoadMainMethod();
		olm.main(10, 20);
	}

}
