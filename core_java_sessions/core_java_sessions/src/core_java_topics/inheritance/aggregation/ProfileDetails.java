package core_java_topics.inheritance.aggregation;

public class ProfileDetails {

	public static void main(String[] args) {
		
		ContactDetails details1 = new ContactDetails("Mohammed Kamran", "12-12-86/2b","Raichur City", "Karnataka", 584101l, "India");
		SavingAccount account1 = new SavingAccount(123456789l, "Raichur Branch", "Mohammed Kamran", 30000.0d, details1);
		
		ContactDetails details2 = new ContactDetails("Mohammed Zeeshan", "1-243/B, Zoo park", "Hyderabad City", "Telangana", 500008l, "India");
		SavingAccount account2 = new SavingAccount(987654321l,"Hyderabad Branch","Mohammed Zeeshan",45000.0d, details2);
		
		account1.displayProfileDetails();
		account2.displayProfileDetails();
		
	}

}
