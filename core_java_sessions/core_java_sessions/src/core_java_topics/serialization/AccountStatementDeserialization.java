package core_java_topics.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AccountStatementDeserialization {

	public static void main(String[] args) {

		try {
				//create the object of ObjectInputStream class and call readObject() method
			
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\iopackages\\accountStatement.txt"));
				AccountStatement statement = (AccountStatement) ois.readObject();
				System.out.println("=========== Account Statement Details ========================");
				System.out.println("Cust Id : " + statement.getCust_id());
				System.out.println("Account Number : " + statement.getAcc_number());
				System.out.println("Customer Name : " + statement.getCust_name());
				System.out.println("Account Branch : " + statement.getAccount_branch());
				System.out.println("Address : " + statement.getAddress());
				System.out.println("State : " + statement.getState());
				System.out.println("City : " + statement.getCity());
				System.out.println("Phone Number : " + statement.getPhone_number());
				System.out.println("Email Address : " + statement.getEmail_address());
				System.out.println("Account Status : " + statement.getAccount_status());
				System.out.println("IFSC Code : " + statement.getIfsc_code());
				System.out.println("Branch Code : " + statement.getBranch_code());
				
				ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
