package core_java_topics.classInJava;

public class IndividualRetirementAccountDetails {

	public static void main(String[] args) {
		//create object of IndividualRetirementAccount class
		//syntax to create object
		//class_name object_name = new class_name();
		
		IndividualRetirementAccount account1 = new IndividualRetirementAccount();
		IndividualRetirementAccount account2 = new IndividualRetirementAccount();
		IndividualRetirementAccount account3 = new IndividualRetirementAccount();
		
		account1.setIra_acc_num(123456789l);
		account1.setIra_acc_holder_name("Srinivas");
		account1.setIra_branch_name("Bangalore Branch");
		account1.setIra_city("Bangalore City");
		account1.setIra_acc_balance(71000.0d);
		
		account2.setIra_acc_num(987654321);
		account2.setIra_acc_holder_name("Manish");
		account2.setIra_branch_name("Pune Branch");
		account2.setIra_city("Pune City");
		account2.setIra_acc_balance(93500.0d);
		
		account3.setIra_acc_num(753894390l);
		account3.setIra_acc_holder_name("Madhu");
		account3.setIra_branch_name("Hyderabad Branch");
		account3.setIra_city("Hyderabad City");
		account3.setIra_acc_balance(91100.0d);
		
		
		System.out.println("Hashcode of account1 : " + account1.hashCode());
		System.out.println("Hashcode of account2 : " + account2.hashCode());
		System.out.println("Hashcode of account3 : " + account3.hashCode());
		
		
		
		System.out.println("================== Account 1 Details ========================");
		System.out.println("Account Number : " + account1.getIra_acc_num());
		System.out.println("Custmer Name : " + account1.getIra_acc_holder_name());
		System.out.println("Branch Name : " + account1.getIra_branch_name());
		System.out.println("City : " + account1.getIra_city());
		System.out.println("Avaiable balance : " + account1.getIra_acc_balance());
		System.out.println("Bank Name : " + IndividualRetirementAccount.BANK_NAME);
		account1.depositAmount(9000.0d);
		
		System.out.println("================== Account 2 Details ========================");
		System.out.println("Account Number : " + account2.getIra_acc_num());
		System.out.println("Custmer Name : " + account2.getIra_acc_holder_name());
		System.out.println("Branch Name : " + account2.getIra_branch_name());
		System.out.println("City : " + account2.getIra_city());
		System.out.println("Avaiable balance : " + account2.getIra_acc_balance());
		System.out.println("Bank Name : " + IndividualRetirementAccount.BANK_NAME);
		account2.depositAmount(1500.0d);
		
		System.out.println("================== Account 3 Details ========================");
		System.out.println("Account Number : " + account3.getIra_acc_num());
		System.out.println("Custmer Name : " + account3.getIra_acc_holder_name());
		System.out.println("Branch Name : " + account3.getIra_branch_name());
		System.out.println("City : " + account3.getIra_city());
		System.out.println("Avaiable balance : " + account3.getIra_acc_balance());
		System.out.println("Bank Name : " + IndividualRetirementAccount.BANK_NAME);
		account3.depositAmount(900.0d);
	}
}
