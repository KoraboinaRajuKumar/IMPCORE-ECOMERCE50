package core_java_topics.collectionFramework.listInterface.arrayListClass.serialization;

import java.io.Serializable;

public class TransactionStatement implements Serializable{

	private static final long serialVersionUID = 1L;
	private long transaction_id;
	private String narration;
	private String date;
	private double tansaction_amount;
	public TransactionStatement(long transaction_id, String narration, String date, double tansaction_amount) {
		super();
		this.transaction_id = transaction_id;
		this.narration = narration;
		this.date = date;
		this.tansaction_amount = tansaction_amount;
	}
	@Override
	public String toString() {
		return "TransactionStatement [transaction_id=" + transaction_id + ", narration=" + narration + ", date=" + date
				+ ", tansaction_amount=" + tansaction_amount + "]";
	}
	

}
