package core_java_topics.collectionFramework.setInterface.linkedHashSetClass;

import java.util.Objects;

public class TransactionStatement {

	private long trans_id;
	private String trans_desc;
	private String trans_date;
	private double trans_amount;
	
	public TransactionStatement(long trans_id, String trans_desc, String trans_date, double trans_amount) {
		super();
		this.trans_id = trans_id;
		this.trans_desc = trans_desc;
		this.trans_date = trans_date;
		this.trans_amount = trans_amount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(trans_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionStatement other = (TransactionStatement) obj;
		return trans_id == other.trans_id;
	}
	@Override
	public String toString() {
		return "TransactionStatement [trans_id=" + trans_id + ", trans_desc=" + trans_desc + ", trans_date="
				+ trans_date + ", trans_amount=" + trans_amount + "]";
	}
}
