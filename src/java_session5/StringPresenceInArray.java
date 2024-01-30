package java_session5;

public class StringPresenceInArray {

	public static void main(String[] args) {
		
		//Find the string presence in array
		
		String a[]= {"ras","pqr", "lmo", "asd", "ops"};
		String value = "pqr";
		boolean flag=false;
		
		for(String i:a) 
		{
			if(i.equals(value))
			{
				System.out.println("String found");
				flag= true;
				break;
			}
			
		}
			if(flag==false)
			{
				System.out.println("String not found");
			}

	}

}
