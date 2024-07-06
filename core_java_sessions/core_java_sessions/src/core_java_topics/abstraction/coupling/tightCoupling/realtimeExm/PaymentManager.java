package core_java_topics.abstraction.coupling.tightCoupling.realtimeExm;

public class PaymentManager {

	UPIPayment upiPayment;
	CreditCardPayment creditCardPayment;
	PayPalTransfer payPalTransfer;
	DebitCardPayment debitCardPayment;
	ChequePayment chequePayment;
	
	public PaymentManager() {
		upiPayment = new UPIPayment();
		creditCardPayment = new CreditCardPayment();
		payPalTransfer = new PayPalTransfer();
		debitCardPayment = new DebitCardPayment();
		chequePayment = new ChequePayment();
	}
	
	public void transferMoney() {
		System.out.println("This is from Payment Manager Class....");
		System.out.println("========== This is UPI Payment =============================");
		upiPayment.upiTransferMoney();
		System.out.println("========== This is Credit Card Payment =====================");
		creditCardPayment.ccPayment();
		System.out.println("========== This is Pay Pal Payment =========================");
		payPalTransfer.transferVIAPayPal();
		System.out.println("========== This is Debit Card Payment ======================");
		debitCardPayment.debitCardPaymentMethod();
	}
}
