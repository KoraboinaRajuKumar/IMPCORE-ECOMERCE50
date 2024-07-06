package core_java_topics.objectInJava.objectCreation.usingNewInstancMethodOfClassClass;

import core_java_topics.objectInJava.objectCreation.newKeyword.SafeBalanceCheckingAccount;

public class BusinessRelationshipAdvantageAccountDetails {

	public static void main(String[] args) {
		try {
				BusinessRelationshipAdvantageAccount account1 = BusinessRelationshipAdvantageAccount.class.newInstance();
				BusinessRelationshipAdvantageAccount account2 = BusinessRelationshipAdvantageAccount.class.newInstance();
				BusinessRelationshipAdvantageAccount account3 = BusinessRelationshipAdvantageAccount.class.newInstance();
				
				SafeBalanceCheckingAccount account4 = SafeBalanceCheckingAccount.class.newInstance();
				
				account1.setBaa_acc_number(123456789l);
				account1.setBaa_customer_name("Manish Vats");
				account1.setBaa_branch_name("Pune Branch");
				account1.setBaa_city("Pune City");
				account1.setPin_code(500001l);
				account1.setBaa_acc_balance(45200.0d);
				
				account2.setBaa_acc_number(987654321l);
				account2.setBaa_customer_name("Avinash");
				account2.setBaa_branch_name("Mumbai Branch");
				account2.setBaa_city("Mumbai City");
				account2.setPin_code(500004l);
				account2.setBaa_acc_balance(61278.0d);
				
				account3.setBaa_acc_number(956409456l);
				account3.setBaa_customer_name("Pratim Das");
				account3.setBaa_branch_name("Kolkata Branch");
				account3.setBaa_city("Kolkata City");
				account3.setPin_code(200003l);
				account3.setBaa_acc_balance(56230.0d);
				
				account4.setSbca_acc_number(745678945l);
				account4.setSbca_customer_name("Md Kamran");
				account4.setSbca_branch_name("Raichur Branch");
				account4.setSbca_city_name("Raichur City");
				account4.setSsn_number(645894539076l);
				account4.setSbca_acc_balance(50000.0d);
				
				System.out.println("=================== Account 1 Details =======================");
				System.out.println("Account Number : " + account1.getBaa_acc_number());
				System.out.println("Customer Name : " + account1.getBaa_customer_name());
				System.out.println("Branch Name : " + account1.getBaa_branch_name());
				System.out.println("City Name : " + account1.getBaa_city());
				System.out.println("Pin Code : " + account1.getPin_code());
				System.out.println("Available Balance :  " + account1.getBaa_acc_balance());
				
				System.out.println("=================== Account 2 Details =======================");
				System.out.println("Account Number : " + account2.getBaa_acc_number());
				System.out.println("Customer Name : " + account2.getBaa_customer_name());
				System.out.println("Branch Name : " + account2.getBaa_branch_name());
				System.out.println("City Name : " + account2.getBaa_city());
				System.out.println("Pin Code : " + account2.getPin_code());
				System.out.println("Available Balance :  " + account2.getBaa_acc_balance());
				
				System.out.println("=================== Account 3 Details =======================");
				System.out.println("Account Number : " + account3.getBaa_acc_number());
				System.out.println("Customer Name : " + account3.getBaa_customer_name());
				System.out.println("Branch Name : " + account3.getBaa_branch_name());
				System.out.println("City Name : " + account3.getBaa_city());
				System.out.println("Pin Code : " + account3.getPin_code());
				System.out.println("Available Balance :  " + account3.getBaa_acc_balance());
				
				System.out.println("================ This is SafeBalanceChecking Account Details ===================");
				System.out.println("Account Number : " + account4.getSbca_acc_number());
				System.out.println("Customer Name : " + account4.getSbca_customer_name());
				System.out.println("Branch Name : " + account4.getSbca_branch_name());
				System.out.println("City Name : " + account4.getSbca_city_name());
				System.out.println("Adhar Number : " + account4.getSsn_number());
				System.out.println("Account Balance : " + account4.getSbca_acc_balance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}