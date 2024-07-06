package designPatterns.behavioralDesignPattern;

public class NetBankingPayment implements PaymentMethod{

	private long acc_num;
	private String bank_name;
	
	public NetBankingPayment(long acc_num, String bank_name) {
		super();
		this.acc_num = acc_num;
		this.bank_name = bank_name;
	}
	@Override
	public void makePayment(double amount) {
		System.out.println(amount + " Paid through Net Banking");
		
	}

}
