package java_session4;

public class ArrayDimensions {

	public static void main(String[] args) {
		// Create a 2D array
		
        //int[][] array = new int[rows][columns];
		int a[][]= {{10,20,30},{15,25,35},{20,35,40}};

        // Display the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < a.length-1; i++) 
        {
            for (int j = 0; j < a[i].length-1; j++) {
                System.out.print(a[i][j] + " ");
            }
           
        }

        // Output the dimensions
        System.out.println("Number of Rows: " +a);
        System.out.println("Number of Columns: " + a);
    }

	

}
