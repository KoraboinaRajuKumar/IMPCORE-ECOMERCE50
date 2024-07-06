package core_java_topics.inheritance.multilevelInheritance;

public class AssetDetails {

	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;
	
	public static void main(String[] args) {
		
		AssetDetails details = new AssetDetails();
		details.createAsset();
		details.displayAsset();

	}

	private void createAsset() {
		
		checkingAccount = new CheckingAccount();
		checkingAccount.setAsset_id(1234);
		checkingAccount.setAsset_type("Account");
		checkingAccount.setAcc_num(123456789l);
		checkingAccount.setBank_name("Bank Of America");
		checkingAccount.setBalance(100000.0d);
		checkingAccount.setOverDraftLimit(200000.0d);
		
		savingAccount = new SavingAccount();
		savingAccount.setAsset_id(5678);
		savingAccount.setAsset_type("Account");
		savingAccount.setAcc_num(987654321l);
		savingAccount.setBank_name("Bank Of America");
		savingAccount.setBalance(50000.0d);
		savingAccount.setInterest_rate(6.75d);
	}
	
	private void displayAsset() {
		
		checkingAccount.displayCheckingInfo();
		savingAccount.displaySavingInfo();
	}
}
