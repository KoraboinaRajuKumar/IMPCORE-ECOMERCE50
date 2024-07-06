package designPatterns.creationalDesignPattern.prototypeDesignPattern;

public class Transaction implements Prototype{

	private long trans_id;
	private String trans_date;
	private double trans_amt;
	private String trans_type;
	
	public Transaction(long trans_id, String trans_date, double trans_amt, String trans_type) {
		super();
		this.trans_id = trans_id;
		this.trans_date = trans_date;
		this.trans_amt = trans_amt;
		this.trans_type = trans_type;
	}
	
	public Prototype clone() {
		return new Transaction(trans_id, trans_date, trans_amt, trans_type);
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", trans_date=" + trans_date + ", trans_amt=" + trans_amt
				+ ", trans_type=" + trans_type + "]";
	}
	
}
