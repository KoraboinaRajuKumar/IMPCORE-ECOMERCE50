package core_java_topics.iopackage;

import java.io.FileInputStream;

public class FileInputStreamExm1 {

	public static void main(String[] args) {
		try {
			 FileInputStream fis = new FileInputStream("C:\\iopackages\\test1.txt");
			 int i = fis.read();
			 System.out.println((char)i);
			 fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
