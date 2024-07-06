package core_java_topics.abstraction.abstractClassInJava.abstractExm3;

public class AccountDetails extends ForexDematAccount{

	public static void main(String[] args) {
		
		ForexDematAccount account = new AccountDetails();
		account.displayAccInfo();

	}

	@Override
	public void displayAccInfo() {
		System.out.println("=========== Account Details ================");
		System.out.println("Account Number : 123456789");
		System.out.println("Account Holder Name : Mohammed Kamran");
		System.out.println("Branch Name : Raichur Branch");
		System.out.println("Account Balance : 50000.0");
	}

}
