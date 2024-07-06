package core_java_topics.collectionFramework.listInterface.arrayListClass.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TransactionDetails {

	public static void main(String[] args) {
		
		/*ArrayList<TransactionStatement> statement = new ArrayList<TransactionStatement>();
		statement.add(new TransactionStatement(123456789l, "Phone Pe", "01-06-2024", 1000.0d));
		statement.add(new TransactionStatement(123456765l, "GPay", "02-06-2024", 5000.0d));
		statement.add(new TransactionStatement(123456700l, "UPI Pe", "03-06-2024", 5300.0d));
		statement.add(new TransactionStatement(123456723l, "Phone Pe", "04-06-2024", 11000.0d));
		statement.add(new TransactionStatement(123456755l, "GPay", "05-06-2024", 6200.0d));
		//serializing list of object
		try {
				ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("C://iopackages//transactionStatement.txt"));
				oout.writeObject(statement);
				oout.close();
				System.out.println("List of object serializaed......");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		//de-serializing list of object
		try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C://iopackages//transactionStatement.txt"));
				List<TransactionStatement> statement =  (List<TransactionStatement>) ois.readObject();
				for(TransactionStatement obj : statement) {
					System.out.println(obj);
				}
				ois.close();
		} catch (Exception e) {

		}
	}
}
