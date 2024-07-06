package core_java_topics.iopackage;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExm2 {

	public static void main(String[] args) {
		try {
			 	
				//create the object of File class
				File file = new File("c:\\iopackages\\test2.txt");
				//create the object of FileOutputStream class
				FileOutputStream fout = new FileOutputStream(file);
				//I am going to hyderabad
				String sentance = "I am going to hyderabad";
				//convert string into byte array
				byte[] b = sentance.getBytes();
				fout.write(b);
				fout.close();
				System.out.println("Data saved successfully....");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
