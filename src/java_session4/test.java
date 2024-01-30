package java_session4;

public class test {

	public static void main(String[] args) {
		// Create a 2D array
        int a[][]  = new int[4][2];
        a[0][0]= 1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;
        a[3][0]=7;
        a[3][1]=8;
        

        // Display the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i <=a.length-1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
           // System.out.println();
        }

        // Output the dimensions
        System.out.println("Number of Rows: " +3);
        System.out.println("Number of Columns: " + 1);
    }

	

}
