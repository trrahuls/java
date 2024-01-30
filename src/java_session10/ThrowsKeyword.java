package java_session10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws  InterruptedException, IOException {
		
		FileReader fr= null;
		fr= new FileReader("D:\\api_automation\\test.txt");
		BufferedReader bfr= new BufferedReader(fr);
		System.out.println(bfr.readLine());
		Thread.sleep(5000);

	}

}
