package core_java_topics.iopackage;

import java.io.File;
import java.io.FileOutputStream;

public class FIleOutputStreamExm1 {

	public static void main(String[] args) {
		try {
			
				//first create the object of File class
				File file = new File("C:\\iopackages\\test1.txt");
				//create the object of FileOutputStream class
				FileOutputStream fout = new FileOutputStream(file);
				fout.write(68);
				fout.close();
				System.out.println("Data written successfully....");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
