package core_java_topics.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ThrowsKeyword {

	public static void main(String[] args) {
		
		try {
			getFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getFile() throws FileNotFoundException,IOException{
		
		FileReader reader = new FileReader("C:\\iopackages\\test.txt");
		BufferedReader br = new BufferedReader(reader);
		System.out.println(br);
	}
}
