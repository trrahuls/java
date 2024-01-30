package java_session8;

class Bank  // parent class
{
	double rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank // child class
{
	double rateOfInterest()
	{
		return 6.75;
	}
}
class HDFC extends Bank  // child class
{
	double rateOfInterest()
	{
		return 8.75;
	}
}
class AXIS extends Bank  // child class
{
	double rateOfInterest()
	{
		return 9.75;
	}
}


public class MethodOverRiding {

	public static void main(String[] args) 
	{
	
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		

		HDFC hdfc = new HDFC();
		System.out.println(hdfc.rateOfInterest());
		

		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());

	}

}
