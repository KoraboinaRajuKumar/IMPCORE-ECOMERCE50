package core_java_topics.collectionFramework.setInterface.linkedHashSetClass;

public class Account {

	private long acc_num;
	private String acc_holder_name;
	private String branch_name;
	private double acc_balance;
	
	public Account(long acc_num, String acc_holder_name, String branch_name, double acc_balance) {
		super();
		this.acc_num = acc_num;
		this.acc_holder_name = acc_holder_name;
		this.branch_name = branch_name;
		this.acc_balance = acc_balance;
	}
	@Override
	public String toString() {
		return "Account [acc_num=" + acc_num + ", acc_holder_name=" + acc_holder_name + ", branch_name=" + branch_name
				+ ", acc_balance=" + acc_balance + "]";
	}
}
