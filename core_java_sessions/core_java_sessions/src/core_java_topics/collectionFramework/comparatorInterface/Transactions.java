package core_java_topics.collectionFramework.comparatorInterface;

public class Transactions {

	long trans_id;
	String trans_date;
	String trans_type;
	double trans_amount;
	
	public Transactions(long trans_id, String trans_date, String trans_type, double trans_amount) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
	}
	@Override
	public String toString() {
		return "Transactions [trans_id=" + trans_id + ", trans_date=" + trans_date + ", trans_type=" + trans_type
				+ ", trans_amount=" + trans_amount + "]";
	}
}
