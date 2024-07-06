package core_java_topics.serialization.aggregation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProfileDetails {

	public static void main(String[] args) {
		/*try {
			ContactDetails details1 = new ContactDetails("Mohammed Kamran", "12-12-86/2b","Raichur City", "Karnataka", 584101l, "India");
			SavingAccount account1 = new SavingAccount(123456789l, "Raichur Branch", "Mohammed Kamran", 30000.0d, details1);
			
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("C:\\iopackages\\contactDeatils.txt"));
			oout.writeObject(account1);
			oout.close();
			System.out.println("Contact details serialized successfully...");
		}catch (Exception e) {
				e.printStackTrace();
		}*/
		//deserialization
		try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\iopackages\\contactDeatils.txt"));
				SavingAccount account = (SavingAccount) ois.readObject();
				System.out.println(account);
				ois.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
