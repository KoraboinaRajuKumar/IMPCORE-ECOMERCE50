package core_java_topics.iopackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamExm {

	public static void main(String[] args) {
		try {
			//create object of File class
			
			File file = new File("C:\\iopackages\\test3.txt");
			//create the object of BuffferedOutputStream class
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String sentance = "I hope you are enjoying the session";
			byte b[] = sentance.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
			System.out.println("This is BufferedOutputStream class exm.....");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
