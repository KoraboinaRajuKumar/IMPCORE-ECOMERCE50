package core_java_topics.encapsulation.package1;

public class WholesaleGTRFAccount {

	//private access_modifier
	private long gtrf_acc_number = 5786565476l;
	private String branch = "Raichur Branch";
	private String gtrf_acc_holder_name = "Mohammed Kamran";
	private String city = "Raichur City";
	private double gtrf_acc_balance = 40000.0d;
	
	public void gtrfAccInfo() {
		System.out.println("========== Account Details =============");
		System.out.println("Account Number : " + gtrf_acc_number);
		System.out.println("Branch Name : " + branch);
		System.out.println("Account Holder Name : " + gtrf_acc_holder_name);
		System.out.println("City : " + city);
		System.out.println("Balance : " + gtrf_acc_balance);
	}
	
	public static void main(String[] args) {
		
		WholesaleGTRFAccount account = new WholesaleGTRFAccount();
		account.gtrfAccInfo();
	}
}
