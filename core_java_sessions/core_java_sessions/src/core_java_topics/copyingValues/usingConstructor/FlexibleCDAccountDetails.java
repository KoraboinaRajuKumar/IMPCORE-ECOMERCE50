package core_java_topics.copyingValues.usingConstructor;

public class FlexibleCDAccountDetails {
	
	public static void main(String[] args) {
			
		FlexibleCDAccount account1 = new FlexibleCDAccount(123456789l, "Mohammed Kamran","Raichur Branch",
				"Raichur City", 10000.0d, 10.75d, true, 500000.0d,10);
		
		FlexibleCDAccount account2 = new FlexibleCDAccount(account1);
		
		account1.displayFDAInfo();
		account2.displayFDAInfo();
		
	}

}
