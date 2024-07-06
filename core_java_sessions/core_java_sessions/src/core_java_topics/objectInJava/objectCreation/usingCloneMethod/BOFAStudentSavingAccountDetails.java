package core_java_topics.objectInJava.objectCreation.usingCloneMethod;

public class BOFAStudentSavingAccountDetails {

	public static void main(String[] args) {
		try {
				BOFAStudentSavingAccount account1 = new BOFAStudentSavingAccount();
				account1.setSsa_acc_num(123456789l);
				account1.setSsa_stud_name("Mohammed Kamran");
				account1.setSsa_branch_name("Raichur City");
				account1.setSsa_city("Raichur City");
				account1.setSsn_num(876908l);
				account1.setSsa_available_balance(20000.0d);
				
				System.out.println("============== Before Cloning The Object ======================");
				System.out.println("Account Number : " + account1.getSsa_acc_num());
				System.out.println("Student Name : " + account1.getSsa_stud_name());
				System.out.println("Branch Name : " + account1.getSsa_branch_name());
				System.out.println("City : " + account1.getSsa_city());
				System.out.println("Social Security Number : " + account1.getSsn_num());
				System.out.println("Available Balance : " + account1.getSsa_available_balance());
				
				BOFAStudentSavingAccount account2 = (BOFAStudentSavingAccount) account1.clone();
				account2.setSsa_acc_num(987654321l);
				account2.setSsa_stud_name("Saba Naaz Siddiqui");
				account2.setSsa_branch_name("Raichur Branch");
				account2.setSsa_city("Raichur City");
				account2.setSsn_num(7456754l);
				account2.setSsa_available_balance(75000.0d);
				
				System.out.println("================= After Cloning The Object ======================");
				System.out.println("Account Number : " + account2.getSsa_acc_num());
				System.out.println("Student Name : " + account2.getSsa_stud_name());
				System.out.println("Branch Name : " + account2.getSsa_branch_name());
				System.out.println("City : " + account2.getSsa_city());
				System.out.println("Social Security Number : " + account2.getSsn_num());
				System.out.println("Avaialble Balance : " + account2.getSsa_available_balance());
				
				BOFAStudentSavingAccount account3 = (BOFAStudentSavingAccount) account1.clone();
				account3.setSsa_acc_num(657340906l);
				account3.setSsa_stud_name("Mohammed Farhan");
				account3.setSsa_branch_name("Raichur Branch");
				account3.setSsa_city("Raichur City");
				account3.setSsn_num(7234097l);
				account3.setSsa_available_balance(80000.0d);
				
				System.out.println("================= After Cloning The Object ======================");
				System.out.println("Account Number : " + account3.getSsa_acc_num());
				System.out.println("Student Name : " + account3.getSsa_stud_name());
				System.out.println("Branch Name : " + account3.getSsa_branch_name());
				System.out.println("City : " + account3.getSsa_city());
				System.out.println("Social Security Number : " + account3.getSsn_num());
				System.out.println("Avaialble Balance : " + account3.getSsa_available_balance());
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
