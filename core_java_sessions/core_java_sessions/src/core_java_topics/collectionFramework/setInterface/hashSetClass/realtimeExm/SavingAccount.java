package core_java_topics.collectionFramework.setInterface.hashSetClass.realtimeExm;

import java.util.Objects;

public class SavingAccount {

	private long sa_acc_number;
	private String sa_acc_holder_name;
	private String branch_name;
	private String city;
	private double sa_acc_balance;
	
	public SavingAccount(long sa_acc_number, String sa_acc_holder_name, String branch_name, String city,
			double sa_acc_balance) {
		super();
		this.sa_acc_number = sa_acc_number;
		this.sa_acc_holder_name = sa_acc_holder_name;
		this.branch_name = branch_name;
		this.city = city;
		this.sa_acc_balance = sa_acc_balance;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sa_acc_number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		return sa_acc_number == other.sa_acc_number;
	}

	@Override
	public String toString() {
		return "SavingAccount [sa_acc_number=" + sa_acc_number + ", sa_acc_holder_name=" + sa_acc_holder_name
				+ ", branch_name=" + branch_name + ", city=" + city + ", sa_acc_balance=" + sa_acc_balance + "]";
	}
	
}
