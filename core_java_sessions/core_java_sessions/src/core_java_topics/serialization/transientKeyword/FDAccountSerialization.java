package core_java_topics.serialization.transientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FDAccountSerialization {

	public static void main(String[] args) {

		try {
				/*FixedTermDepositAccount account = new FixedTermDepositAccount(345678876l, "Mohammed Kamran","Raichur Branch","Raichur City", "Karnataka State",
						7207513883l, 8.6d, 100000.0d);
				
				FileOutputStream fout = new FileOutputStream("C:\\iopackages\\fdAccount.txt");
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				oout.writeObject(account);
				oout.close();
				fout.close();
				System.out.println("Data Serialized Successfully...");*/
			
				FileInputStream fis = new FileInputStream("C:\\iopackages\\fdAccount.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				FixedTermDepositAccount account =   (FixedTermDepositAccount) ois.readObject();
				System.out.println("================ Fixed Term Deposit Account Details ======================");
				System.out.println("Account Number : " + account.getFd_acc_number());
				System.out.println("Customer Name : " + account.getFd_cust_name());
				System.out.println("Branch Name : " + account.getFd_branch_name());
				System.out.println("City : " + account.getFd_city());
				System.out.println("State : " + account.getFd_state());
				System.out.println("Mobile Number : " + account.getMobile_number());
				System.out.println("Rate Of Interest : " + account.getRate_of_interest());
				System.out.println("Term Amount : " + account.getFd_amount());
				
				ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
