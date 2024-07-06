package core_java_topics.collectionFramework.mapInterface.hashMapClass.realtimeExm;

public class CreditCard {

	private long cc_number;
	private String cc_holder_name;
	private String expiry_date;
	private int cvv_number;
	private int pin_number;
	private double cc_limit;
	public CreditCard(long cc_number, String cc_holder_name, String expiry_date, int cvv_number, int pin_number,
			double cc_limit) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.pin_number = pin_number;
		this.cc_limit = cc_limit;
	}
	@Override
	public String toString() {
		return "CreditCard [cc_number=" + cc_number + ", cc_holder_name=" + cc_holder_name + ", expiry_date="
				+ expiry_date + ", cvv_number=" + cvv_number + ", pin_number=" + pin_number + ", cc_limit=" + cc_limit
				+ "]";
	}
}
