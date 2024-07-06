package core_java_topics.iopackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class BufferedInputStreamExm {

	public static void main(String[] args) {
		
		try {
			   FileInputStream fis = new FileInputStream("C:\\iopackages\\test4.txt");
			   
			   BufferedInputStream bis = new BufferedInputStream(fis);
			   int i = 0;
			   while((i=bis.read())!=-1) {
				   System.out.print((char)(i));
			   }
			   bis.close();
			   fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
