package core_java_topics.objectInJava.objectCreation.usingNewInstanceMethodOfConstructorClass;

import java.lang.reflect.Constructor;

public class BusinessAdvantageFundamentalAccountDetails {
	
	public static void main(String[] args) {
		try {
			
				Constructor<BusinessAdvantageFundamentalAccount> constructorObj = BusinessAdvantageFundamentalAccount.class.getConstructor();
				BusinessAdvantageFundamentalAccount account1 = constructorObj.newInstance();
				BusinessAdvantageFundamentalAccount account2 = constructorObj.newInstance();
				
				account1.setBafa_acc_number(123456789l);
				account1.setBafa_cust_first_name("Mohammed");
				account1.setBafa_cust_last_name("Kamran");
				account1.setDate_of_birth("08-10-1983");
				account1.setZipCode(584101l);
				account1.setContact_number(7207513883l);
				account1.setMailing_address("kamranmohammed2005@gmail.com");
				account1.setLandmark1("Opp Court Complex");
				account1.setLandmark2("Govt School");
				account1.setStreet_number(12);
				account1.setBafa_acc_balance(39076.0d);
				
				account2.setBafa_acc_number(987654321l);
				account2.setBafa_cust_first_name("Saba");
				account2.setBafa_cust_last_name("Siddiqui");
				account2.setDate_of_birth("19-01-1990");
				account2.setZipCode(584101l);
				account2.setContact_number(8618224203l);
				account2.setMailing_address("saba.siddiqui1990@gmail.com");
				account2.setLandmark1("Opp Court Complex");
				account2.setLandmark2("Govt School");
				account2.setStreet_number(12);
				account2.setBafa_acc_balance(64988.0d);
				
				System.out.println("======================= Account 1 Details ===================");
				System.out.println("Account Number : " + account1.getBafa_acc_number());
				System.out.println("First Name : " + account1.getBafa_cust_first_name());
				System.out.println("Last Name : " + account1.getBafa_cust_last_name());
				System.out.println("Date of Birth : " + account1.getDate_of_birth());
				System.out.println("Zip Code : " + account1.getZipCode());
				System.out.println("Contact Number : " + account1.getContact_number());
				System.out.println("Mailing Address : " + account1.getMailing_address());
				System.out.println("Land Mark 1 : " + account1.getLandmark1());
				System.out.println("Land Mark 2 : " + account1.getLandmark2());
				System.out.println("Street Number : " + account1.getStreet_number());
				System.out.println("Available Balance : " + account1.getBafa_acc_balance());
				
				System.out.println("======================= Account 2 Details ===================");
				System.out.println("Account Number : " + account2.getBafa_acc_number());
				System.out.println("First Name : " + account2.getBafa_cust_first_name());
				System.out.println("Last Name : " + account2.getBafa_cust_last_name());
				System.out.println("Date of Birth : " + account2.getDate_of_birth());
				System.out.println("Zip Code : " + account2.getZipCode());
				System.out.println("Contact Number : " + account2.getContact_number());
				System.out.println("Mailing Address : " + account2.getMailing_address());
				System.out.println("Land Mark 1 : " + account2.getLandmark1());
				System.out.println("Land Mark 2 : " + account2.getLandmark2());
				System.out.println("Street Number : " + account2.getStreet_number());
				System.out.println("Available Balance : " + account2.getBafa_acc_balance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}