package java_session4;

public class TwoDimesionalArray {

	public static void main(String[] args) {
		
		//int a[][]= {{100,200}, {250,300}, {500, 600},{550, 660}};
		int a[][]= {{100,200,300}, {400,500,600}, {650, 750,800},{850, 900,950}};
	//	System.out.println(a.length);
		
		// read value from array
		for(int r=0; r<=a.length-1; r++)
		{
			for(int c=0; c<=a[r].length-1; c++)
			{
				System.out.println(a[r][c]);
			}
		}
		
	}

}
