package core_java_topics.abstraction.interfaceInJava.interfaceExm2;

public class AccountBeneficieryDetails implements IBeneficieryService{

	public static void main(String[] args) {

		IBeneficieryService details = new AccountBeneficieryDetails();
		details.getAccountDetails(5010005678l);
		details.isAccountActive();
		details.addBeneficiery();
	}

	@Override
	public void getAccountDetails(long acc_num) {
		System.out.println("============= Account Details ===================");
		System.out.println("Account Number : " + acc_num);
		System.out.println("Holder Name : Mohammed Kamran");
		System.out.println("Branch Name : Raichur Branch");
		System.out.println("Available Balance : 274000.0");
	}

	@Override
	public void isAccountActive() {
		System.out.println("Account is Active");
	}

	@Override
	public void addBeneficiery() {
		System.out.println("This is add beneficiery method");
	}

	@Override
	public void deleteBeneficiery() {
		System.out.println("This is delete beneficiery method");
	}

	@Override
	public void updateBeneFiciery() {
		System.out.println("This is update beneficiery method");
		
	}

}
