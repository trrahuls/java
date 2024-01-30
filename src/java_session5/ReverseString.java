package java_session5;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="elearntesting"; //gnitsetnraele
		
		int len=s.length(); //13
		//System.out.println(len);
		String rev= "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev); //g
		

	}

}
