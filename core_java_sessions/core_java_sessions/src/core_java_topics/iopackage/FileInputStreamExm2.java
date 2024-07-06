package core_java_topics.iopackage;

import java.io.FileInputStream;

public class FileInputStreamExm2 {

	public static void main(String[] args) {
		
		try {
			 FileInputStream fis = new FileInputStream("C:\\iopackages\\test3.txt");
			 int i = 0;
			 while((i=fis.read())!=-1) {
				System.out.print((char)i); 
			 }
			 fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
