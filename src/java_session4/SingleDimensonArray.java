package java_session4;

public class SingleDimensonArray {

	public static void main(String[] args) {
	
		// SingleDimensonArray
		int a[]=new int[5];// declaration
		a[0]= 200;
		a[1]=300;
		a[2]=400;
		a[3]=500;
		a[4]= 600;
		
		
		//int a[]= {200,100,300,400,100,100}; // Declaring array with specifying size
		
		// find the size of an array
		//System.out.println(a.length);
		
		// read the values from an array
		//System.out.println(a[4]);
		
		// print the value of array when we know the size of array
		// classic for loop
		/*for(int i=0; i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		*/
		//print the value of array when we don't know the size of array
		
		/*for(int i=0; i<=a.length-1;i++)
		{
		System.out.println(a[i]);
		}
		*/
		
		//Enhanced for loop
		for(int i:a) {
			System.out.println(i);
		}

	}
	
	

}
