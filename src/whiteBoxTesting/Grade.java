package whiteBoxTesting;

public class Grade {
	
	void gradeResult() {
		
		int marks=9;
		
		if(marks>=90) 
		{
			
			System.out.println("A++");
		}
		else if (marks<90 && marks>75) 
		{
			System.out.println("A+");
		}
		else if (marks<75 && marks>60) 
		{
			System.out.println("B++");
		}
		else if (marks<60 && marks>45)
		{
			System.out.println("B+");
		}
		else if (marks<45 && marks>33)
		{
			System.out.println("C+");
		}
		else if (marks==33)
		{
			System.out.println("Lucy gai");
		}
		else
		{
			System.out.println("See you next year");
		}
	}
		
	public static void main(String[] args) {
		
		
		Grade gr= new Grade();
		gr.gradeResult();
		
	}

}
