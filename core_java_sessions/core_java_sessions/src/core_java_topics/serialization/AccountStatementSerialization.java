package core_java_topics.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountStatementSerialization {

	public static void main(String[] args) {
		try {
				AccountStatement statement = new AccountStatement(54176588l, 5010057547l, "Mohammed Kamran", "Raichur Branch",
						"12-12-86/2b", "Karnataka", "Raichur City", 7207513883l, "kamranmohammed2005@gmail.com", "Regular", 67480l, 766);
				FileOutputStream fout = new FileOutputStream("C:\\iopackages\\accountStatement.txt");
				//create the object of ObjectOutputStream class to write the data into byte-stream
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				//call writeObject(Object obj) of ObjectOutputStream class
				oout.writeObject(statement);
				oout.close();
				fout.close();
				System.out.println("Data serialized successfully.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
