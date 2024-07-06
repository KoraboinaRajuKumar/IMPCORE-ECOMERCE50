package core_java_topics.iopackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExm {

	public static void main(String[] args) {
		try {
				File file1 = new File("C:\\iopackages\\test4.txt");
				File file2 = new File("C:\\iopackages\\test5.txt");
				
				FileOutputStream fout1 = new FileOutputStream(file1);
				FileOutputStream fout2 = new FileOutputStream(file2);
				
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				
				String sentance = "This is ByteArrayOutputStream class example";
				byte b[] = sentance.getBytes();
				bout.write(b);
				
				bout.writeTo(fout1);
				bout.writeTo(fout2);
				
				bout.close();
				fout1.close();
				fout2.close();
				
				System.out.println("Common data is saved into multiple files......");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
