package core_java_topics.inheritance.superKeyword;

public class IMPSTransfer extends Pay {

	long imps_id = 987654321l;
	String imps_description = "Made an IMPS Transfer";
	String date_of_transfer = "16-05-2024";
	double transfer_amount = 40000.0d;
	int otp_number = 5555;
	
	public void method2() {
		super.method1();
		System.out.println("This is IMPS Transfer method2()......");
	}
	
	public void displayTransferInfo() {
		System.out.println("=============== This is IMPS Transfer ================");
		System.out.println("IMPS Id : " + imps_id);
		System.out.println("Description : " + imps_description);
		System.out.println("Transfer Date : " + date_of_transfer);
		System.out.println("Amount Transfered : " + transfer_amount);
		System.out.println("Otp Number : " + otp_number);
		
		System.out.println("=============== These are Pay class instance variables ==========");
		System.out.println("Payment Id : " + super.payment_id);
		System.out.println("Remarks : " + super.remarks);
		System.out.println("Mode Of Payment : " + super.mode_of_payment);
		System.out.println("Bill Amount : " + super.bill_amount);
		System.out.println("Pin Number : " + super.pin_num);
	}
	public static void main(String[] args) {
		IMPSTransfer transfer = new IMPSTransfer();
		transfer.displayTransferInfo();
		transfer.method2();
	}
}
