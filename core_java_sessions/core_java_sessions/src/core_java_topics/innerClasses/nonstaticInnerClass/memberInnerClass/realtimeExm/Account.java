package core_java_topics.innerClasses.nonstaticInnerClass.memberInnerClass.realtimeExm;

public class Account {

	private String bank_name = "Bank Of America";
	
	//declare member inner class
	class SavingAccount{
		
		private long acc_number = 123456789l;
		private String cust_name ="Mohammed Kamran";
		private String branch_name = "Raichur Branch";
		
		public void displaySAInfo() {
			System.out.println("========= This is Saving Account Details ==============");
			System.out.println("Account Number : " + acc_number);
			System.out.println("Customer Name : " + cust_name);
			System.out.println("Branch Name : " + branch_name);
			System.out.println("Bank Name : " + bank_name);
		}
	}
	
	//declare member inner class
	class CheckingAccount{
		
		private long ca_acc_number = 987654321l;
		private String ca_holder_name = "Saba Naaz Siddiqui";
		private String branch_name = "Raichur Branch";
		private double ca_available_balance = 50000.0d;
		
		public void displayCAInfo() {
			System.out.println("========= This is Checking Account Details ==========");
			System.out.println("Account Number : " + ca_acc_number);
			System.out.println("Account Holder Name : " + ca_holder_name);
			System.out.println("Branch Name : " + branch_name);
			System.out.println("Available Balance : " + ca_available_balance);
			System.out.println("Bank Name : " + bank_name);
		}
	}
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		Account.SavingAccount savingAccount = account.new SavingAccount();
		savingAccount.displaySAInfo();
		
		Account.CheckingAccount checkingAccount = account.new CheckingAccount();
		checkingAccount.displayCAInfo();
		
		
	}
}


