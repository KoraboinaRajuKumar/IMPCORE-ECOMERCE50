package designPatterns.behavioralDesignPattern;

public class UPIPayment implements PaymentMethod{

	private long upiId;
	
	public UPIPayment(long upiId) {
		super();
		this.upiId = upiId;
	}
	@Override
	public void makePayment(double amount) {
		System.out.println(amount  + " Paid through UPI Payment");
	}
	

}
