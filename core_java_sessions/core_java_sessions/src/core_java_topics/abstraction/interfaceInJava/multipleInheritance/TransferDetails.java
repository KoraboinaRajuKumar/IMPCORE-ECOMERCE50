package core_java_topics.abstraction.interfaceInJava.multipleInheritance;

public class TransferDetails implements IFundTransferService,IVisaCardPay{

	public static void main(String[] args) {
		TransferDetails details = new TransferDetails();
		//details.cardPay();
		//details.transferWithInBank();
		details.impsTransfer();
	}

	@Override
	public void cardPay() {
		System.out.println("Sender Name : Mohammed Kamran");
		System.out.println("Receiver Name : Saba Naaz");
		System.out.println("Card Number : 123456789");
		System.out.println("Amount : 30000.0");
	}

	@Override
	public void transferWithInBank() {
		System.out.println("=========== Fund Transfer with in Bank ==============");
		System.out.println("Account Number : 987654321");
		System.out.println("Customer Name : Mohammed Zeeshan");
		System.out.println("Transfer Date : 24-05-2024");
		System.out.println("Transfer Amount : 100000.0");
	}
	@Override
	public void impsTransfer() {
		System.out.println("========== Fund Transfer IMPS ======================");
		System.out.println("Account Number : 67584354");
		System.out.println("Account Holder Name : Mohammed Irfan");
		System.out.println("Amount : 35000.0");
	}
	@Override
	public void neftTransfer() {
		System.out.println("========= Fund Transfer NEFT =======================");
		System.out.println("Transfer Date : 27-05-2024");
		System.out.println("Transfer Amount : 10000.0");
		System.out.println("Customer Name : Farhan");
	}
}
